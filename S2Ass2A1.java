/*Program to define a thread for printing text on output screen for ‘n’ number of times.
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
Example:
i. First thread prints “COVID19” 10 times.
ii. Second thread prints “LOCKDOWN2020” 20 times
iii. Third thread prints “VACCINATED2021” 30 times

 */

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("COVID19...."+i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println("LOCKDOWN2020...."+i);
        }
    }
}


class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=30;i++)
        {
            System.out.println("VACCINATED2021...."+i);
        }
    }
}

public class S2Ass2A1 {

    public static void main(String args[])
    {
        A obj=new A();
        obj.start();

        B obj1=new B();
        obj1.start();

        C obj2=new C();
        obj2.start();
    }
}

/* OUTPUT:
COVID19....1
COVID19....2
COVID19....3
COVID19....4
COVID19....5
COVID19....6
COVID19....7
LOCKDOWN2020....1
LOCKDOWN2020....2
LOCKDOWN2020....3
LOCKDOWN2020....4
LOCKDOWN2020....5
LOCKDOWN2020....6
LOCKDOWN2020....7
LOCKDOWN2020....8
LOCKDOWN2020....9
LOCKDOWN2020....10
LOCKDOWN2020....11
LOCKDOWN2020....12
LOCKDOWN2020....13
LOCKDOWN2020....14
LOCKDOWN2020....15
LOCKDOWN2020....16
LOCKDOWN2020....17
LOCKDOWN2020....18
LOCKDOWN2020....19
LOCKDOWN2020....20
VACCINATED2021....1
VACCINATED2021....2
VACCINATED2021....3
VACCINATED2021....4
VACCINATED2021....5
COVID19....8
VACCINATED2021....6
COVID19....9
VACCINATED2021....7
COVID19....10
VACCINATED2021....8
VACCINATED2021....9
VACCINATED2021....10
VACCINATED2021....11
VACCINATED2021....12
VACCINATED2021....13
VACCINATED2021....14
VACCINATED2021....15
VACCINATED2021....16
VACCINATED2021....17
VACCINATED2021....18
VACCINATED2021....19
VACCINATED2021....20
VACCINATED2021....21
VACCINATED2021....22
VACCINATED2021....23
VACCINATED2021....24
VACCINATED2021....25
VACCINATED2021....26
VACCINATED2021....27
VACCINATED2021....28
VACCINATED2021....29
VACCINATED2021....30

 */