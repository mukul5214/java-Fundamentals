package Oops.Exception_Handiling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    double AccountBalance;
    BankAccount(int accountBalance){
        AccountBalance = accountBalance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > AccountBalance){
            throw new InsufficientBalanceException("Balance Low");
        }
        AccountBalance =- amount;
    }
}

public class Main {
    public static void main(String[] args)  {
        BankAccount ac = new BankAccount(150000);
        Scanner sc = new Scanner(System.in);
        try{
            ac.withdraw(sc.nextDouble());
        }catch (InsufficientBalanceException e ){
            System.out.println("low balance");
        }finally {
            sc.close();
        }
    }
}
