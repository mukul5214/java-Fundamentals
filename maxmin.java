import java.util.*;

public class maxmin {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n = sh.nextInt();
        int numbers[] = new int[n];

        System.out.println("enter the values: ");
        for ( int i =0 ; i < n ; i++ ){
            numbers[i] = sh.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for ( int i = 0 ; i< n ; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        for ( int i = 0 ; i< n ; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
            System.out.println("the greatest number in the array is : "+ max);
            System.out.println("the smallest number in the array is : "+ min);
    }
}
