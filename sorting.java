import java.util.*;

public class sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        // array input.
        for( int i =0 ; i<n ; i++){
            num[i]= sc.nextInt();
        } 

        for(int i = 0 ; i<n ; i++){
            for( int j = 0 ; j<n-i-1 ; j++){
                int temp = num[j];
                if( num[j] > num[j+1]){
                    //swap.
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }

        // printing output.
        for ( int i =0 ; i< n;i++){
            System.out.print(num[i]+" ");
        }
        sc.close();
    }
}
