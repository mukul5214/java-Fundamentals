import java.util.*;

public class multitable {
public static void main(String[] args){
    System.out.println("enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i =0 ; i<=10 ; i++){
        System.out.println(n+" *"+  i+ " ="+ i*n);
    }
}
}
