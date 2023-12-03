public class SecondTest {
    public static void main(String[] args) {

        int result = externalMethod(4,3,2);
        System.out.println("The addtion of 3 numbers: "+result);
    }
    public static int externalMethod(int a,int b,int c)
    {
        return (a+b+c);
    }
}
