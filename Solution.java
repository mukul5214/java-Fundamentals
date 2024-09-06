import java.util.*;
public class Solution {
    public static String mergestrings(String word1 , String word2){
        StringBuilder merge = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int i=0;
        int j=0;

        while (i<l1 && i<l2){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<l1){
            merge.append(word1.charAt(i));
            i++;
        }
        while(j<l2){
            merge.append(word2.charAt(j));
            j++;
        }
        return merge.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(mergestrings(s1,s2));
    }
}
