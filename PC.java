import java.util.*;

class prodcons {
    LinkedList list = new LinkedList();

    public void produce() throws InterruptedException
    {
        int value = 0;
        while (true)
        {
            synchronized (this)
            {
                while (list.size() > 0)
                    wait();

                System.out.println("Produced data :" + value);
                list.add(value);
                value++;
                notify();

                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException
    {
        while (true)
        {
            synchronized (this)
            {
                while (list.size() == 0)
                    wait();

                int value = (int) list.removeFirst();
                System.out.println("Consume data :" + value);
                notify();

                Thread.sleep(1000);


            }
        }
    }
}

class PC {
    public static void main(String[] args) throws Exception {
        prodcons pc = new prodcons();
        Thread t1 = new Thread(new Runnable() {
            public void run()
              {
                try {
                    pc.produce();
                    }
                 catch (Exception e) { }
             }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                    }
                catch (Exception e) {}
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}


/*OUTPUT:
ProducerConsumer
Produced data :0
Consume data :0
Produced data :1
Consume data :1
Produced data :2
Consume data :2
Produced data :3
Consume data :3
Produced data :4
Consume data :4
Produced data :5
Consume data :5
.
.
 */