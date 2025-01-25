package JavaBasics.DatePkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {
        String dateStr0 = "23-June-2016";// dd-MMMM-yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sdf.parse(dateStr0);
        System.out.println(dateStr0);
        System.out.println(date0);

        String dateStr1 = "23 | June 16  8:34";//dd | MMMM yy hh:mm
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sdf1.parse(dateStr1);
        System.out.println(dateStr1);
        System.out.println(date1);

        String dateStr2 = "2016-06-23 | 8:34:23";// yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sdf2.parse(dateStr2);
        System.out.println(dateStr2);
        System.out.println(date2);

        String dateStr3 = "Thursday 2016/06/23";// EEEE yyyy/MM/dd
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sdf3.parse(dateStr3);
        System.out.println(dateStr3);
        System.out.println(date3);

        String dateStr4 = "23-06-2016 | thu | 8:34";//dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date date4 = sdf4.parse(dateStr4);
        System.out.println(dateStr4);
        System.out.println(date4);

        String dateStr5 = "8:34:22";// hh:mm:ss
        SimpleDateFormat sdf5 = new SimpleDateFormat("hh:mm:ss");
        Date date5 = sdf5.parse(dateStr5);
        System.out.println(dateStr5);
        System.out.println(date5);

        System.out.println(date0.toString());
        System.out.println(date4.before(new Date()));
        System.out.println(date5.after(new Date()));
        System.out.println(new Date().equals(new Date()));
    }
}
