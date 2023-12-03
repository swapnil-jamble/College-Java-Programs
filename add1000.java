
class ThreadSum extends Thread
{
    int start ,end;
    int sum;
    ThreadSum(int start , int end)
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
    }
    int getSum()
    {
        return sum;
    }
}

public class add1000 {
    public static void main(String[] args) throws InterruptedException {


        ThreadSum t1 = new ThreadSum(1,100);
        t1.start();
        t1.join();
        System.out.println(t1.getSum());

        ThreadSum t2 = new ThreadSum(101,200);
        t2.start();
        t2.join();
        System.out.println(t2.getSum());

        ThreadSum t3 = new ThreadSum(201,300);
        t3.start();
        t3.join();
        System.out.println(t3.getSum());

        ThreadSum t4 = new ThreadSum(301,400);
        t4.start();
        t4.join();
        System.out.println(t4.getSum());
        ThreadSum t5 = new ThreadSum(401,500);
        t5.start();
        t5.join();
        System.out.println(t5.getSum());

        ThreadSum t6 = new ThreadSum(501,600);
        t6.start();
        t6.join();
        System.out.println(t6.getSum());
        ThreadSum t7 = new ThreadSum(601,700);
        t7.start();
        t7.join();
        System.out.println(t7.getSum());

        ThreadSum t8 = new ThreadSum(701,800);
        t8.start();
        t8.join();
        System.out.println(t8.getSum());

        ThreadSum t9 = new ThreadSum(801,900);
        t9.start();
        t9.join();
        System.out.println(t9.getSum());

        ThreadSum t10 = new ThreadSum(901,1000);
        t10.start();
        t10.join();
        System.out.println(t10.getSum());

        int sum=0;
        sum = t1.getSum() +t2.getSum() +t3.getSum() +t4.getSum() +t5.getSum() +t6.getSum() +t7.getSum() +t8.getSum() +t9.getSum() +t10.getSum();
        System.out.println("The addition of numbers between 1 to 1000 :"+sum);
    }
}

/* OUTPUT:
5050
15050
25050
35050
45050
55050
65050
75050
85050
95050
The addition of numbers between 1 to 1000 :500500
 */