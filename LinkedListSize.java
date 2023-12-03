/*11.	Write a Java program to create LinkedList of integer objects and perform the following:
 i. Add element at first position
 ii. Delete last element
   iii. Display the size of link list
 */

import java.util.Scanner;
        import java.util.*;

public class LinkedListSize {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add(50);
        l.add(30);
        l.add(20);
        l.addFirst(88);
        System.out.println("After adding first element in the LinkedList:" + l);
        l.removeLast();
        System.out.println("after removing last element from the LinkedList:" + l);
        int size = l.size();
        System.out.println("The size of the LinkedList:" + size);

    }
}

/*OUTPUT:
After adding first element in the LinkedList:[88, 50, 30, 20]
after removing last element from the LinkedList:[88, 50, 30]
The size of the LinkedList:3
 */