import java.util.*;

public class fabbonaci {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        int next;
        for (int i = 0; i < n - 2; i++) {
            next = n1 + n2;
            System.out.print(" " + next);
            n1 = n2;
            n2 = next;
            sh.close();
        }
    }
}