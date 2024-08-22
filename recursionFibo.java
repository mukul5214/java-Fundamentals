import java.util.*;
public class recursionFibo {
    public static int Fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Fibo(x));
        sc.close();
    }
}
