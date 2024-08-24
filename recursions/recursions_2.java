package recursions;

// finding factorial of n.
import java.util.*;

public class recursions_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("factorial of "+x+ " is: "+fact(x));
    }

    public static int fact(int n){
        if (n==1 || n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
}
