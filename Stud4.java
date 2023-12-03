/*4.	Write a Java Program to create the hash table that will maintain the mobile number and student name.
 display the details of student using Enumeration interface.

 */

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Stud4 {
    public static void main(String[] args) {
        Hashtable ts = new Hashtable();

        Scanner sc = new Scanner(System.in);

        ts.put("nil",50);
        ts.put("omu",171);
        ts.put("wednesday",99);
        ts.put("otis",90);

        System.out.println("the names & mobile no of students:");
        System.out.println(ts);

        Enumeration ele = ts.elements();
        Enumeration key = ts.keys();

        while(key.hasMoreElements())
        {
            System.out.print(key.nextElement()+" ");
        }
        System.out.println();
        while(ele.hasMoreElements())
        {
            System.out.print(ele.nextElement()+" ");
        }



    }
}
