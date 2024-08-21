import java.util.*;

public class recursion{
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        n = n * fact(n-1);
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fact(x));
        sc.close();
    }
}