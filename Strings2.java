import java.io.*;
import java.util.*;

public class Strings2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = s;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        String ans = String.valueOf(sb);
        if(temp.equals(ans)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}