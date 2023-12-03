//Write a java program to accept names of ‘n’ cities, insert same into array list
//collection and display the contents of same array list, also remove all these elements

import java.util.ArrayList;
import java.util.Scanner;

public class S2Ass1A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList a = new ArrayList();

        System.out.println("Enter the no. of cities:");
        int n = sc.nextInt();
        String s[] = new String[n];

        for(int i=0; i<n; i++)
        {
           s[i] = sc.next();
           a.add(s[i]);

        }
        System.out.println("Displaying ArrayList:"+a);
        a.clear();
        System.out.println("After Removing ArrayList:"+a);
    }
}

/*
OUTPUT:
Enter the no. of cities:
5
pune
baramti
patas
supe
mumbai
Displaying ArrayList:[pune, baramti, patas, supe, mumbai]
After Removing ArrayList:[]
 */