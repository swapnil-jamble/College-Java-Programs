public class RecursionClass {
    static int result = 1;

    public static void main(String[] args) {
        int num = 5;
       int factorial =  fact(num);
        System.out.println("The factorial of given number is: "+factorial);
        System.out.println("the num is : "+num);
    }
    public static int fact(int num)
    {
        if(num>0) {
            result = result * num;

            fact(num - 1);
        }
        return result;
    }
}
