/*
Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task
 */

import java.util.Scanner;

public class Clock {
    int hour,min,sec;
    String mode;

    Scanner sc = new Scanner(System.in);
    Clock()
    {
        System.out.println("Enter the Hour, Minutes & Seconds:");
        hour = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
    }

    void checkValid()
    {
        if(hour>12 && hour<1)
            System.out.println("Ur input is wrong..");
        if(min>60 && min<0)
            System.out.println("Ur input is wrong..");
        if(sec>60 && sec<0)
            System.out.println("Ur input is wrong..");
    }
    void setTime()
    {
        System.out.println("Set the mode of time AM/Pm");
        mode = sc.next();
    }

    void display()
    {
        System.out.println(hour+":"+min+":"+sec+"|"+mode);
    }

    public static void main(String[] args) {
        Clock obj = new Clock();
        obj.checkValid();
        obj.setTime();
        obj.display();
    }
}

/* OUTPUT:
Enter the Hour, Minutes & Seconds:
10
50
30
Set the mode of time AM/Pm
AM

10:50:30|AM

 */