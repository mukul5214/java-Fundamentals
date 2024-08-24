package recursions;

// to reverse a number.
import java.util.*;

public class recursions_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        rev(x);
        System.out.println(sum);
    }

    // for reversing a number we use a variable which gets updated by using "sum=sum*10 + rem" 
    static int sum = 0;

    public static void rev(int n){
        if (n==0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        rev(n/10);
    }
}
