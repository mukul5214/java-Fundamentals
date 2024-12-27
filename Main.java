import java.util.*;
public class Main{
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("current date = " + date);

        Calendar calander = Calendar.getInstance();
        int year = calander.get(Calendar.YEAR);
        int month = calander.get(Calendar.MONTH);
        int dat = calander.get(Calendar.DAY_OF_MONTH);
        int hour = calander.get(Calendar.HOUR_OF_DAY);

        System.out.println(hour);

    }
}