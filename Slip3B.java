//Write a Java program to create LinkedList of String objects and perform the following:
//i. Add element at the end of the list
//ii. Delete first element of the list
//iii. Display the contents of list in reverse order

import java.util.*;

public class Slip3B {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("swapnil");
        l.add("omu");
        l.add("avi");
        l.addLast("suraj");
        System.out.println("After adding Last element :"+l);
        l.removeFirst();
        System.out.println("After removing first element : "+l);
        Collections.reverse(l);
        System.out.println("After reversing linkedlist : "+l);
    }
}

/*
OUTPUT:
After adding Last element :[swapnil, omu, avi, suraj]
After removing first element : [omu, avi, suraj]
After reversing linkedlist : [suraj, avi, omu]
 */