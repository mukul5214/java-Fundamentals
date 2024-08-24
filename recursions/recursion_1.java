package recursions;

// printing numbers using recursion.

import java.util.*;

public class recursion_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
        sc.close();
    }

    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
