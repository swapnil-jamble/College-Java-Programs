/*
Write a program to create parent class College(cno, cname, caddr)
and derived class Department(dno, dname) from College. Write a
necessary methods to display College details.
 */

import java.util.Scanner;

class College
{
    int cno;
    String cname;
    String caddr;

     College()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the college number:");
        cno = sc.nextInt();
        System.out.println("Enter the college name:");
        cname = sc.next();
        System.out.println("Enter the college Address:");
        caddr = sc.next();
    }
    void display()
    {
        System.out.println("College Number :"+cno+" College Name :"+cname+" College Address :"+caddr);
    }
}


public class College_Department extends College           // class Department  extends College
{
    int dno;
    String dname;
    Scanner sc = new Scanner(System.in);

    College_Department()
    {
        super();
        System.out.println("Enter the department number :");
         dno = sc.nextInt();
        System.out.println("Enter the department name: ");
         dname = sc.next();
    }
    void display()
    {
        super.display();
        System.out.println("Department Number :"+dno+" Department Name :"+dname);

    }


    public static void main(String[] args)
    {
       College_Department obj = new College_Department();
       obj.display();

    }
}

/* output:

Enter the college number:
0
Enter the college name:
LearnWorld
Enter the college Address:
LearnOnline
Enter the department number :
0
Enter the department name:
LearnComputer

College Number :0 College Name :LearnWorld College Address :LearnOnline
Department Number :0 Department Name :LearnComputer
 */
