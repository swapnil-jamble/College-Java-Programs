//Write a program to sort HashMap by keys and display the details before sorting and
//after sorting.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class S2Ass1B2 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(5,"swapnil");
        h.put(1,"seri");
        h.put(88,"alexa");
        h.put(101,"hena");
        h.put(2,"messi");
        h.put(3,"otis");

        System.out.println("Before Sorting HashMap is:");
        Iterator itr = h.keySet().iterator();
        while(itr.hasNext())
        {
            int key = (int)itr.next();
            System.out.println(key+" = "+h.get(key));
        }

        System.out.println("After Sorting HashMap is:");
        TreeMap t = new TreeMap(h);
        Iterator itr1 = t.keySet().iterator();
        while(itr1.hasNext())
        {
            int key = (int)itr1.next();
            System.out.println(key+" = "+h.get(key));
        }

    }
}
/*OUTPTU:
Before Sorting HashMap is:
1 = seri
2 = messi
3 = otis
5 = swapnil
101 = hena
88 = alexa

After Sorting HashMap is:
1 = seri
2 = messi
3 = otis
5 = swapnil
88 = alexa
101 = hena
 */