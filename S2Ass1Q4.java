//) Create the hash table that will maintain the mobile number and student name. Display
//the contact list.

import java.util.Hashtable;

public class S2Ass1Q4 {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put("swapnil",123);
        h.put("om",345);
        h.put("siri",987);
        h.put("alexa",324);

        System.out.println(h);
    }
}

/*
OUTPUT:
{om=345, siri=987, swapnil=123, alexa=324}
 */