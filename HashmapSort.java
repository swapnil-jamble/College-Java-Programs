import java.util.HashMap;
import java.util.TreeMap;

public class HashmapSort {
    public static void main(String args[])
    {
        HashMap map = new HashMap();

        // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        System.out.println(map);
        TreeMap tree = new TreeMap(map);
        System.out.println(tree);
    }
}



