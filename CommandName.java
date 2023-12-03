/*10.	Write a java program to accept ‘N’ student names through command line, store them into the appropriate Collection
 and display them by using Iterator and ListIterator interface.

 */

import java.util.Scanner;
        import java.util.*;

public class CommandName {

    public static void main(String[] args) throws Exception
    {
        LinkedList t = new LinkedList();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<args.length; i++)
        {
            String str = args[i];
            t.add(str);
        }

        System.out.println(t);

        Iterator it = t.iterator();
        System.out.println("The names using Iterator:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        ListIterator lt = t.listIterator();
        System.out.println("The names using ListIterator:");
        while(lt.hasNext())
        {
            System.out.println(lt.next());
        }

    }
}

/*
OUTPUT:
 C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac CommandName.java
 C:\Users\swapniljamble\IdeaProjects\MyProject\src> java CommandName swapnil nil omu avi raju sam tej wednesday jack
[swapnil, nil, omu, avi, raju, sam, tej, wednesday, jack]
The names using Iterator:
swapnil
nil
omu
avi
raju
sam
tej
wednesday
jack
The names using ListIterator:
swapnil
nil
omu
avi
raju
sam
tej
wednesday
jack

 */