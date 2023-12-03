/*11)	Program to define a thread for printing text on output screen for „n‟ number of times.
 Create 3 threads and run them. Pass the text „n‟ parameters to the thread constructor. Example:
i.	First thread prints “COVID19” 10 times.
ii.	Second thread prints “LOCKDOWN2020” 20 times
iii.	Third thread prints “VACCINATED2021” 30 times

 */
class Thread1 extends Thread
{
 public void run()
 {
     for(int i=0; i<10; i++)
         System.out.println("COVID19");
 }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0; i<20; i++)
            System.out.println("LOCKDOWN2020");
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        for(int i=0; i<30; i++)
            System.out.println("VACCINATED2021");
    }
}
public class ThreadText {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        Thread3 t3= new Thread3();
        t2.start();
        t1.start();
        t3.start();

    }
}

/* OUTPUT:
LOCKDOWN2020
COVID19
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
COVID19
COVID19
COVID19
COVID19
COVID19
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
LOCKDOWN2020
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
LOCKDOWN2020
LOCKDOWN2020
COVID19
COVID19
COVID19
COVID19
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021
VACCINATED2021

 */