import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = (int) ((Math.log10(num))+1);
        if(num==fun(num,digits)){
            System.out.println("the given number is astronomical");
        }else{
            System.out.println("the given number is not astronomical");
        }

    }

    public static int fun(int n,int  digit){
        int sum = 0;
        for(int i =0 ; i<digit; i++){
            sum = (int) (sum  + Math.pow(n%10,digit));
            n = n/10;
        }
        return sum;
    }
}
