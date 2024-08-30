import java.io.*;
import java.util.*;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int k = sc.nextInt();
        String smallest = S.substring(0,k);
        String largest = S.substring(0,k);

        for (int i = 1 ; i <=S.length() - k ; i++  ){
            String S2 = S.substring(i,i+k);
            if(S2.compareTo(smallest)<0){
                smallest=S2;
            }
            if(S2.compareTo(largest)>0){
                largest = S2;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}

