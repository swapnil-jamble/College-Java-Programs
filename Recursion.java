import java.util.Scanner;

public class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        recursionMethod(num);
    }

    public static void recursionMethod(int num)
    {
        System.out.println(" Inside Recurstion method");
        if(num>1)
        {
            recursionMethod(num-1);
        }
    }
}
