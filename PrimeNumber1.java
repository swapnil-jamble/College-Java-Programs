public class PrimeNumber1 {
    public static void main(String[] args) {


        int i,num,n,count;
        n=20;
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
