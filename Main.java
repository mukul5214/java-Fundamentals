import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            try {
                long n = Long.parseLong(input);
                System.out.println(n + " can be fitted in:");
                boolean fits = false;

                // Check for byte
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                    fits = true;
                }

                // Check for short
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    fits = true;
                }

                // Check for int
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    fits = true;
                }

                // Check for long
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                    fits = true;
                }

                // If no types fit
                if (!fits) {
                    System.out.println(n + " can't be fitted anywhere.");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}