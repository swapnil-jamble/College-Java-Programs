/*6.	Write a java program to create a TreeSet, add some colors (String) and
print out the content of TreeSet in ascending order.

 */

import java.util.TreeSet;

public class color6 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("pink");
        t.add("blue");
        t.add("red");
        t.add("white");
        t.add("black");

        System.out.println("By default elements are inserted according to the defalut natural soring order into Treeset:");
        System.out.println("so the color are asending order:"+t);
    }
}

/*OUTPUT:
By default elements are inserted according to the defalut natural soring order into Treeset:
so the color are asending order:[black, blue, pink, red, white]

Process finished with exit
 */