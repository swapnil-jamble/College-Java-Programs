/*
Write a Program to print all Prime numbers in an array of ‘n’
elements. (use command line arguments)
 */

public class Prime_no {
      static  boolean IsPrime(int n)              // here we write static because now we not need to create object...
        {
            boolean Flag = true;
            if(n<=1)
                return false;
            else
                for(int i=2; i<n; i++)        //   for(int i=2; i<n/2; i++) This is also true...
                {
                    if(n%i == 0)
                    {
                        Flag = false;
                        break;
                    }
                }
                return Flag;

        }
    public static void main(String[] args) {

         int n = Integer.parseInt(args[0]);
                                                  //       Prime_no obj = new Prime_no();
        if(IsPrime(n))                           //        if(obj.IsPrime(n))
        {
            System.out.println(n+ " is a Prime numebr..");
        }
        else
            System.out.println(n+ " is not a prime numebr!!");
    }
}
