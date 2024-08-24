package recursions;

// to find sum of digits in given interger.
import java.util.*;

public class recursions_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sum(x));
        sc.close();
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n/10)+ n%10;
    }
}
