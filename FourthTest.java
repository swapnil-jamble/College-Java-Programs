import java.util.Scanner;

public class FourthTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Principle amount:");
        double pamount = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter the Duration:");
        double duration = sc.nextDouble();

        simpleInterest(pamount,rate,duration);

    }

    public static void simpleInterest(double pamount, double rate, double duration)
    {
        double result = (pamount*rate*duration)/100;
        System.out.println("The Simple interest is : "+result);
    }
}
