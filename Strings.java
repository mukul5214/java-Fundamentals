import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length()+b.length());
        if(a.compareTo(b)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String c = a.substring(0,1).toUpperCase() + a.substring(1);
        String d = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(c+" "+d);
    }
}