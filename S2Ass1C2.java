/* Write a program to create link list of integer objects. Do the following:
i. add element at first position
ii. delete last element
iii. display the size of link list
 */

import java.util.LinkedList;

public class S2Ass1C2 {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(5);
        l.add(9);
        l.add(53);
        l.add(34);
        l.add(3);
        l.add(93);
        l.addLast(66);
        System.out.println(l);
        l.addFirst(88);
        System.out.println("After Adding element in first position:"+l);
        l.removeLast();
        System.out.println("After removing last element in link list:"+l);
        System.out.println("The size of given Linked list is: "+l.size());

    }
}

/* OUTPUT:
[5, 9, 53, 34, 3, 93, 66]
After Adding element in first position:[88, 5, 9, 53, 34, 3, 93, 66]
After removing last element in link list:[88, 5, 9, 53, 34, 3, 93]
The size of given Linked list is: 7
 */