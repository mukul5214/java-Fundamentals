import java.util.*;

public class recursion_Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1,3,4,65,78,99,100};
        System.out.print("enter the key : ");
        int key = sc.nextInt();

        System.out.println("the key is present at "+ B_search(num,key,0,6)+ " position");
        sc.close();
    }

    public static int B_search(int[] arr , int key , int s , int e){

        if (s>e) {
            return -1;
        }
        int m = (s+e)/2;
        if (key == arr[m]) {
            return m;
        }
        if (key<arr[m]) {
            return B_search(arr, key, s, m-1);
        }
        
        return B_search(arr, key, m+1, e);
    }
}
