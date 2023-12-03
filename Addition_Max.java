/*
 Write a package for Operation, which has two classes, Addition and
Maximum. Addition has two methods add () and subtract (), which are
used to add two integers and subtract two, float values respectively.
Maximum has a method max () to display the maximum of two integers

 */

package Operation;
import java.util.Scanner;

class Addition
{
    float a,b;
    Addition(float a, float b)
    {
        this.a = a;
        this.b = b;
    }

    float add()
    {
        return a+b;
    }
    float sub()
    {
        return a-b;
    }
}

public class Addition_Max {

    float a,b;
    Addition_Max(float a, float b)
    {
        this.a = a;
        this.b = b;
    }
    float max()
    {
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        Addition obj = new Addition(a,b);
        Addition_Max m = new Addition_Max(a,b);
        System.out.println("The addition of two numbers are:"+obj.add());
        System.out.println("The substraction of two numbers are:"+obj.sub());
        System.out.println("The Maximum of two numbers are:"+m.max());


    }
}

/*
Enter the two numbers:
50 6
The addition of two numbers are:56.0
The substraction of two numbers are:44.0
The Maximum of two numbers are:50.0
 */
