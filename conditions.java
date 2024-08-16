import java.util.*;

public class conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("a and b are equal");
        }
       else{
           if(a>b){
               System.out.println("a is larger than b");
           }
           else{
               System.out.println("a is lesser than b");
           }
        }
        sc.close();
    }
}