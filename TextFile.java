import java.io.*;
import java.util.*;
class TextFile
{
    public static void main(String args[]) throws IOException
    {
        FileReader f = new FileReader("myfile.txt");
        Scanner sc = new Scanner(f);
        String CH,CH2;
        while(sc.hasNext())
        {
            StringBuilder CH1 = new StringBuilder();
            CH = sc.nextLine();
            CH2=CH.toUpperCase();
            CH1.append(CH2);
            CH1.reverse();
            System.out.println(CH1);
        }
        f.close();
    }
}

/* OUTPUT:
C:\Users\swapniljamble\Documents\javapad programs>javac TextFile.java

C:\Users\swapniljamble\Documents\javapad programs>java TextFile
S'EYUG PU S'TAHW OLLEH
..GINROM DOOG


myfile.txt
hello whats's up guye's
good morning..
*/