public class ReverseNumber {
    public static void main(String args[])
    {
        int num = 123;

        int temp = num;
        int rem=0;
        int result=0;

        while(temp>0)
        {
            rem = temp%10;
            result = (result*10)+rem;
            temp = temp/10;
        }
        System.out.println("The original number is :"+num);
        System.out.println("The reverse number is : "+result);
    }
}
