import java.util.*;

public class sum {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.print("enter the valuse of n: ");
        int n = sh.nextInt();
        int sum =0;
        for(int i =0 ; i<= n ; i++){
            sum = sum + i;
        }
        System.out.println("the sum of n natural numbers are: "+sum);
        sh.close();
    }
}
