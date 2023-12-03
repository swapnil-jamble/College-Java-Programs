
class sum extends Thread
{
    int start,end;
    static int summ;
    sum(int start,int end)
    {
        this.start = start;
        this.end = end;
    }
    public void run()
    {
        for(int i=start; i<=end; i++)
        {
            summ +=i;
        }

    }
    public void getAvg()
    {
        int avg = summ/100;
    }
}

public class P_P1 {
    public static void main(String[] args)throws  Exception {
        sum[] s = new sum[10];
        int start=0;
        for(int i=0; i<10; i++)
        {
            s[i] = new sum(++start,start+=99);
            s[i].start();
            s[i].join();
        }

        System.out.println("sum:"+sum.summ);
    }
}