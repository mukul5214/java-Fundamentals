import java.util.*;
public class AlterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        fun(s1,s2);

    }
    public static void fun(String word1 , String word2){
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int small;
        int large;
        char[] temp;
        if (word1.length()<word2.length()){
            small = word1.length();
            large = word2.length();
            temp = new char[word2.length()];
            temp = word2.toCharArray();
        }else {
            small = word2.length();
            large = word1.length();
            temp = new char[word1.length()];
            temp = word1.toCharArray();
        }

        for(int i = 0 ; i <small ; i++){
            System.out.print(arr1[i]);
            System.out.print(arr2[i]);
        }
        if(small!=large){
            for(int i =  small ; i < large ; i++ ){
                System.out.print(temp[i]);
            }
        }
    }
}
