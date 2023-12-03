/*
Write a program to find the cube of given number using functional interface.
my note: functional interface means only single abstract class.
 */

import java.util.Scanner;

interface Cube
        {
            void  funcCube(int num);
        }
class Concrete implements Cube
{
    public void funcCube(int num)
    {
        System.out.println("The cube of "+num+" is: "+Math.pow(num,3));
    }
}


public class Functional_Interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        Concrete obj = new Concrete();
        obj.funcCube(num);
    }
}
