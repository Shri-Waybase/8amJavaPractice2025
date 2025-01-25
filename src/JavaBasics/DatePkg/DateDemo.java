package JavaBasics.DatePkg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date);
        // Convert date in the dd/MM/YYYY
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = sdf.format(date);
        System.out.println("Date in the dd/MM/YYYY :"+ strDate);

        // Convert date in the MM/dd/YYYY
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
        String strDate1 = sdf1.format(date);
        System.out.println("Date in the MM/dd/yyyyy: " +strDate1);

        //Convert date into yyyy/dd/MM

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/dd/MM");
        String strDate2 = sdf2.format(date);
        System.out.println("Date in the yyyy/dd/MM :" + strDate2);

        // Convert date into MM/dd/yy :
        SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yy");
        String strDate3 = sdf3.format(date);
        System.out.println("Date in the MM/dd/yy : "+ strDate3);

        //Convert the date into MM/dd/YYYY  hh:mm:ss

        SimpleDateFormat sdf4 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss ");
        String strDate4 = sdf4.format(date);
        System.out.println("Date in the MM/dd/yyyy hh:mm:ss : " + strDate4);

        // Convert the date into EEEE MMM-dd-yyyy hh:mm

        SimpleDateFormat sdf5 = new SimpleDateFormat("EEEE MMM-dd-yyyy hh:mm");
        String strDate5 = sdf5.format(date);
        System.out.println("Date in the EEEE MMM-dd-yyyy hh:mm  : "+ strDate5);

    }
}
