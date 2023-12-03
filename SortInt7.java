/*7.	Write a java program to accept ‘N’ integers from a user.
 Store and display integers in sorted order having proper collection class.
The collection should not accept duplicate elements.

 */

import java.util.Scanner;
import java.util.TreeSet;

public class SortInt7 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of integers:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for(int i=0; i<n; i++)
        {
            t.add(sc.nextInt());
        }

        System.out.println("By default elements are inserted according to the defalut natural soring order into Treeset:");
        System.out.println("so the numbers are sorting order:"+t);
    }
}

/*OUTPUT:
Enter the no of integers:
7
Enter the numbers:
99
1
34
50
88
77
66
By default elements are inserted according to the defalut natural soring order into Treeset:
so the numbers are sorting order:[1, 34, 50, 66, 77, 88, 99]

 */