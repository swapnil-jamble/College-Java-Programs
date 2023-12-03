    /*12)	Write a program in which thread sleep for 6 sec in the loop in reverse order from 100 to 1
    and change the name of thread.

     */

     class ReversedOrder extends Thread
     {
         public void run()
         {
             for(int i=100; i>=1; i--)
             {

                 System.out.println(i);
                 try {
                     Thread.sleep(100);
                 }
                 catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     }
    public class ThreadSleep {
        public static void main(String[] args) throws Exception {
            ReversedOrder rv = new ReversedOrder();
            rv.start();
            System.out.println("The default name of thread:"+rv.getName());
            rv.setName("swapnil");
            System.out.println("After changing name of Thread:"+rv.getName());

        }
    }


    /* OUTPUT:
    100
    The default name of thread:Thread-0
    After changing name of Thread:swapnil
    99
    98
    97
    96
    95
    .
    .
    .
     */