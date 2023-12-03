import java.util.Scanner;

public class FifthTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product quantity:");
        int qty = sc.nextInt();
        System.out.println("Enter the product price:");
        double price = sc.nextDouble();
        double result = bill(qty,price);
        System.out.println("The Total Product Bill is :"+result);
    }

    public static double bill(int qty, double price) {
        double totalBill = qty * price;
        return totalBill;
    }
}
