//java program for generate random number and create 10 thread to sum and average.

class ThreadSum1 extends Thread
{
    int start ,end;
    int sum;
    static int allsum;
    ThreadSum1(int start , int end)
    {
        this.start = start;
        this.end = end;
    }
    public void run()
    {
        for(int i = start; i<=end; i++)
        {
            sum += i;
        }
        allsum +=sum;
    }
    static int getAvg()
    {
        return allsum/100;
    }
}
public class SumAvgThread {
    public static void main(String[] args) throws InterruptedException {

       int start = 0, end=99;
       ThreadSum1 ts[] = new ThreadSum1[10];

       for(int i=0; i<10; i++)
       {
           ts[i] = new ThreadSum1(++start,start+=end);
           ts[i].start();
           ts[i].join();
       }

        System.out.println("Sum of number between 1 to 1000 :"+ThreadSum1.allsum);
        System.out.println("Average is: "+ThreadSum1.getAvg());
    }
}

/* OUTPUT:
Sum of number between 1 to 1000 :500500
Average is: 5005

 */

