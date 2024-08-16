import java.util.*;

public class matrix {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.print("enter the number of rowa : ");
        int rows = sh.nextInt();
        System.out.print("enter the number of columns: ");
        int columns = sh.nextInt();

        int matrix[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for (int j=0;j< columns ;j++){
                matrix[i][j]= sh.nextInt();
            }
        }

        System.out.print("enter the key: ");
        int key = sh.nextInt();

        for(int i=0;i<rows;i++){
            for (int j=0;j< columns ;j++){
                if(matrix[i][j]==key){
                    System.out.println("the key is at position "+(i+1)+" row and "+ (j+1) +" colums");
                }
            }
        }
    }
}
