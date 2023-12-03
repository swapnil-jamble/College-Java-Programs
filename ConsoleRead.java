/*
java program Create Class student(rollno,name,class,per) to read Student information from console
and display them using BufferedReader
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class student
{
    int rollno;
    String name,std;
    float per;
    student(int rollno,String name, String std, float per)
    {
        this.rollno = rollno;
        this.name = name;
        this.std = std;
        this.per = per;
    }
    void display()
    {
        System.out.println("Rollno :"+rollno+"\t Name :"+name+"\tclass :"+std+" \tpercentage :"+per);
    }
}
public class ConsoleRead {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rollno = Integer.parseInt(args[0]);
        String name = args[1];
        String std = args[2];
        float per = Float.parseFloat(args[3]);

        student obj = new student(rollno,name,std,per);
        obj.display();
    }

}

/*
OUTPUT:

PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac ConsoleRead.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java ConsoleRead 50 swapnil tybcs 88

Rollno :50     Name :swapnil   class :tybcs    percentage :88.0

 */