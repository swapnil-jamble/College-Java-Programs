/* Write a program to calculate the sum and average of an array of 1000 integers
(generated randomly) using 10 threads. Each thread calculates the sum of 100
integers. Use these values to calculate average. [Use join method ].

 */

class SumThread1 extends Thread
{
    static int sum;

    public void run() {
        for (int i = 1; i <= 3; i++) {
            sum = sum + i;
        }
    }
}

class SumThread2 extends Thread
{
    static int sum;

    public void run() {
        for (int i = 4; i <= 5; i++) {
            sum = sum + i;
        }
    }
}

public class S2Ass2B1 {
    public static void main(String[] args) throws InterruptedException {
        SumThread1 t1 = new SumThread1();
        SumThread2 t2 = new SumThread2();


        t1.start();
        t1.join();

        t2.start();
        t2.join();
        System.out.println(SumThread1.sum);
        System.out.println(SumThread2.sum+SumThread1.sum);

    }
}
