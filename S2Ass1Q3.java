//Write a program to create a new tree set, add some colors (string) and print out the
//tree set

import java.util.TreeSet;

public class S2Ass1Q3 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("Pink");
        t.add("Blue");
        t.add("red");
        t.add("green");
        t.add("black");
        t.add("Yellow");

        System.out.println(t);

    }
}

/*
OUTPUT:
[Blue, Pink, Yellow, black, green, red]
 */