import java.util.*;

public class SWITCH {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);

        System.out.println("enter the number : ");
        int button = sh.nextInt();

        switch(button){
            case 1 : System.out.println("hello");
            case 2 : System.out.println("hello2");
            default: System.out.println("get out");
        }
    }
}
