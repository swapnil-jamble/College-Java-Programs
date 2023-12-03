import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class S2Ass1B3 {
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("fname.txt");
        Scanner sc = new Scanner(fr);
        Hashtable h = new Hashtable();

        while(sc.hasNextLine())
        {
            String name = sc.next();
            Integer phno = sc.nextInt();
            h.put(name,phno);
        }

        System.out.println(h);



    }
}


/* OUTPUT:
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac S2Ass1B3.java
Note: S2Ass1B3.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java S2Ass1B3
{anu=2348, nil=23487, avi=23048, swapnil=298374, omu=238947}

 */