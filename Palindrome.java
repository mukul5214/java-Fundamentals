import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= num; i++) { // <= to include num itself
            if (i == Rev(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int Rev(int i) {
        int ans = 0;
        while (i > 0) {
            int rem = i % 10;
            ans = ans * 10 + rem;
            i = i / 10;
        }
        return ans;
    }
}