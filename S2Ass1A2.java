//Write a java program to read ‘n’ names of your friends, store it into linked list, also
//display contents of the same

import java.util.LinkedList;
import java.util.Scanner;

public class S2Ass1A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList();

        System.out.println("Enter the no. of friends:");
        int n = sc.nextInt();

        String s[] = new String[n];

        System.out.println("Enter the "+n+" names of your friends:");
        for (int i=0; i<n; i++)
        {
           s[i] = sc.next();
           l.add(s[i]);
        }

        System.out.println(l);
    }
}

/*
OUTPUT:
Enter the no. of friends:
5
Enter the 5 names of your friends:
swapnil
raju
om
saurabh
ritik
[swapnil, raju, om, saurabh, ritik]

 */