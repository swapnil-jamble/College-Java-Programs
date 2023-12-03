/*
Write a Program to print all Prime numbers in an array of ‘n’
elements. (use command line arguments)
 */

public class PrimeNumber {
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

        System.out.println("Prime Numbers from 0 to "+n);
        for(int i=0; i<=n; i++)
        {
          if(IsPrime(i))
            {
              System.out.print(i+", ");
            }
        }

    }
}


/*
OUTPUT:
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac PrimeNumber.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java PrimeNumber 100
Prime Numbers from 0 to 100
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
 */
