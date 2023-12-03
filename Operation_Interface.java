/*
Define an interface “Operation” which has method volume(). Define a constant PI having a value 3.142
 Create a class cylinder which implements this interface (members – radius, height).
 Create one  object and calculate the volume.
 */

import java.util.Scanner;

interface Operation
{
    final float PI = (float) 3.142;
    public void volume();
}

class cylinder implements Operation
{
    float r,h;
   public void volume()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and volume of cylinder:");
        r = sc.nextFloat();
        h = sc.nextFloat();

        System.out.println("The volume of cylinder is: "+ (PI*r*r*h));
    }
}
public class Operation_Interface {
    public static void main(String[] args) {

   cylinder obj = new cylinder();
   obj.volume();

    }
}
