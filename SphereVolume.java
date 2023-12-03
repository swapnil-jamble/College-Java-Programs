/*
 Create a class Sphere, to calculate the volume and surface area of
sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))

 */

import java.util.Scanner;

public class SphereVolume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        float r = sc.nextFloat();

        double v = (4/3)*3.14*(r*r*r);
        double sa = 4*3.14*(r*r);

        System.out.println("The volume of the Sphere is: "+v);
        System.out.println("The surface area of the Sphere is: "+sa);
    }
}
/* OUTPUT:
Enter the radius of the sphere:
5

The volume of the Sphere is: 392.5
The surface area of the Sphere is: 314.0

 */