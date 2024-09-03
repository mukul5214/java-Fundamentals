import java.util.*;
public class String_Tokens {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens){
            System.out.println(token);
        }

    }
}
