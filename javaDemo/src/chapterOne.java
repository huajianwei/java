import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class chapterOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" 输入end后结束");
        String str;
        do {
        str = br.readLine();
        System.out.println(str);
        }while(!str.equals( "end"));


        Date today = new Date();
        System.out.println(today);
        

        Calendar cal = Calendar.getInstance();
        cal.set(2022, 7, 2, 15, 56, 29);

        System.out.println(cal.toString());


    // Calendar cal  = Calendar.getInstance();

    //    int year = cal.get(Calendar.YEAR) - 2;

    //    GregorianCalendar gc = new GregorianCalendar();

    //    if (gc.isLeapYear(year)){
    //     System.out.println("isLeapYear");
    //    }else{
    //     System.out.println("Is not Leap Year");
    //    }

    }
}