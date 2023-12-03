// Accept ‘n’ integers from the user. Store and display integers in sorted order having
//proper collection class. The collection should not accept duplicate elements

import java.util.Scanner;
import java.util.TreeSet;

public class S2Ass1B1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Integers:");
        int n = sc.nextInt();

        System.out.println("Enter the Integers:");
        for (int i=0; i<n; i++)
        {
            t.add(sc.nextInt());
        }

        System.out.println(t);
    }
}

/*
OUTPUT:
Enter the no. of Integers:
5
Enter the Integers:
4
3
8
5
1
[1, 3, 4, 5, 8]
 */