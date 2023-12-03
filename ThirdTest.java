import java.util.Scanner;

public class ThirdTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth:");
        double breadth = sc.nextDouble();

        double result = Area(length,breadth);

        System.out.println("The area of rectangle is :"+result);

    }

    public static double Area(double length, double breadth)
    {
      double area = 0.5*length*breadth;
      return area;
    }
}
