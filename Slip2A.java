//1. Write a java program to read ‘N’ names of your friends, store it into HashSet and
//display them in ascending order.

import java.util.*;

public class Slip2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names u want to enter:");
        int n = sc.nextInt();

        HashSet hs = new HashSet(n);
        System.out.println("Enter the Friends names:");
        for(int i=0; i<n; i++)
        {
            String str = sc.next();
            hs.add(str);
        }
        System.out.println("using HashSet before sorting : "+hs);
        TreeSet tr = new TreeSet(hs);
        System.out.println("using Treeset After Natural Sorting : "+tr);
    }
}

/*
OUTPUT:
How many names u want to enter:
5
Enter the Friends names:
swapnil
nil
om
omu
avi

using HashSet before sorting : [nil, avi, swapnil, om, omu]
using Treeset After Natural Sorting : [avi, nil, om, omu, swapnil]

 */