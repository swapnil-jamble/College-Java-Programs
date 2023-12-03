
import java.util.*;

class Square extends Thread
{
    int randnum;
    Square(int randnum)
    {
        this.randnum = randnum;
    }
    public void run()
    {
        System.out.println("The square of even number "+randnum+" is :"+(randnum*randnum));
    }
}

class Cubes extends Thread
{
    int randnum;
    Cubes(int randnum)
    {
        this.randnum = randnum;
    }
    public void run()
    {
        System.out.println("The cube of odd number "+randnum+" is :"+(randnum*randnum*randnum));
    }
}


class GenerateRand extends Thread
{
    Random random = new Random();
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            int randnum = random.nextInt(50);
            System.out.println("The random number is:"+randnum);

              if(randnum%2 == 0)
            {
                Square squ = new Square(randnum);
                squ.start();
            }
            else
            {
                Cubes cube = new Cubes(randnum);
                cube.start();
            }
        }
    }
}

class RandomNumber
{
    public static void main(String [] args)
    {
        GenerateRand gr = new GenerateRand();
        gr.start();
    }
}