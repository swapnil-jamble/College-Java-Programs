// java program for generate random number and find prime numbers from random number using thread concept.
import java.util.*;

class PrimeNum extends Thread
{
    int n;
    PrimeNum(int n)
    {
        this.n = n;
    }
    public void run()
    {

        int i,num,count;

        System.out.println("prime number between 1 to "+n);
        for(num=1;num<=n;num++)
        {
            count=0;
            for(i=2;i<=num/2; i++)
            {
                if(num%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0 && num!=1)
                System.out.println(num);
        }
    }
}
class RandNum extends Thread
{
    Random random = new Random();
   public void run() {
       for (int i = 0; i < 5; i++) {
           int num = random.nextInt(50);
           System.out.println("random  number is:"+num);

           PrimeNum pn = new PrimeNum(num);
           pn.start();
           try {
               pn.join();
           }
           catch(Exception e){}
       }
   }
}
public class RandomPrimeNum {
    public static void main(String[] args) {
        RandNum rn = new RandNum();
        rn.start();
    }
}


/* OUTPUT:
random  number is:37
prime number between 1 to 37
2
3
5
7
11
13
17
19
23
29
31
37
random  number is:3
prime number between 1 to 3
2
3
random  number is:15
prime number between 1 to 15
2
3
5
7
11
13
random  number is:34
prime number between 1 to 34
2
3
5
7
11
13
17
19
23
29
31
random  number is:10
prime number between 1 to 10
2
3
5
7
 */