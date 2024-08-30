import java.util.*;

public class Anagram {
    public static String sort(String str){
        char[] chararray= str.toCharArray();
        java.util.Arrays.sort(chararray);
        return new String(chararray);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        String Str2 = sc.nextLine();

        StringBuilder Sb1 = new StringBuilder(Str1);
        StringBuilder Sb2 = new StringBuilder(Str2);

        String A = Sb1.toString().toUpperCase();
        String B = Sb2.toString().toUpperCase();

        String Str3 = sort(A);
        String Str4 = sort(B);


        if(Str3.compareTo(Str4)==0){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
