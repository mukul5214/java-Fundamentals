

public class bitoperators {
    public static void main(String[] agrs){
        int n =5;
        int i = 2;
        int bitmask= 1<<i;

        if((bitmask & n) ==0){
            System.out.println("the number at the position "+i+" is : zero");
        }else{
            System.out.println("the number at the position "+i+" is : one");
        }
    }
}
