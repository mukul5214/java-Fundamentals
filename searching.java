import java.util.*;

public class searching {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sh.nextInt();
        int numbers[] = new int[n];

        System.out.println("enter the values : ");
        for(int i =0 ; i<n ; i++){
            numbers[i]= sh.nextInt();
        }
        System.out.print("enter the key: ");
        int key = sh.nextInt();

        for(int i=0 ; i < n ; i++){
            if (key == numbers[i]){
                System.out.println("key:"+ key+ " found at position: "+i);
                return;
            }

        }
        System.out.println("the given key is not found");

    }
}
