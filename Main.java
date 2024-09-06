import java.util.*;
public class Main{
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder Merge = new StringBuilder();
        int i = 0;
        int j = 0;
        int l1 = word1.length();
        int l2 = word2.length();
        while (i < l1 && j < l2){
            Merge.append(word1.charAt(i++));
            Merge.append(word2.charAt(j++));
        }
        while (i<l1){
            Merge.append(word1.charAt(i++));
        }
        while (j<l2){
            Merge.append(word2.charAt(j++));
        }
        return Merge.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(mergeAlternately(s1,s2));
    }
}