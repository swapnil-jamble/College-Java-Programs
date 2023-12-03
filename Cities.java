import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Hashtable ts = new Hashtable();
        String name;
        int code;

        Scanner sc = new Scanner(System.in);

        ts.put("pune",50);
        ts.put("america",171);
        ts.put("mexiko",99);
        ts.put("london",90);

        System.out.println("the names of city and their STD codes:");
        System.out.println(ts);

        System.out.println("Enter the city name which want to remove:");
        String scity = sc.next();
        if(ts.containsKey(scity))
                 ts.remove(scity);
        else
            System.out.println("city is not present...");

        System.out.println("After removing city the hashtable is: "+ts);

        System.out.println("enter the city to be search:");
         scity = sc.next();
         if(ts.containsKey(scity))
             System.out.println("the STD code of "+scity+" : "+ts.get(scity));
         else
             System.out.println("city is not present..");

    }
}
