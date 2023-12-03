/*
rogram to define a thread for printing text on output screen for „n‟ number of
times.Create 3 threads and run them. Pass the text „n‟ parameters to the thread
constructor. Example:
i. First thread prints “I AM In FY” 10 times.
 ii. Second thread prints “I AM In SY” 20 times
iii. Third thread prints “I AM In TY” 30 times
 */

class thread111 extends Thread
{
    public void run()
    {
        for(int i=0; i<1; i++)
        {
            System.out.println("I am in fy");
            System.out.println("name"+Thread.currentThread().getName());
            System.out.println("priority:"+Thread.currentThread().getPriority());
        }
    }
}
public class Threads3 {
    public static void main(String[] args) {

thread111 t1 = new thread111();
t1.start();
        System.out.println("naem:"+Thread.currentThread().getName());
        System.out.println("priority:"+Thread.currentThread().getPriority());
    }
}
