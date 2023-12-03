/*
) Write a program to display the system date and time in various
formats shown below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = sdf1.format(date);
        System.out.println("Current date is :"+str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        String str2 = sdf2.format(date);
        System.out.println("Current date is :"+str2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEEE MMMM dd yyyy");
        String str3 = sdf3.format(date);
        System.out.println("Current date is :"+str3);

        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MM dd hh:mm:ss z ");
        String str4 = sdf4.format(date);
        System.out.println("Current date and time is :"+str4);

        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a Z ");
        String str5 = sdf5.format(date);
        System.out.println("Current date and time is :"+str5);


    }

}


/* OUTPUT
Current date is :25/12/2022
Current date is :12-25-2022
Current date is :Sunday December 25 2022
Current date and time is :Sun 12 25 03:19:46 IST
Current date and time is :25/12/2022 03:19:46 pm +0530

 */