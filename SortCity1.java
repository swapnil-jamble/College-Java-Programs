/*
Write a program to accept ‘n’ name of cities from the user and sort
them in ascending order
 */

import java.util.Scanner;

public class SortCity1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int n = sc.nextInt();

        String name[] = new String[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of city :"+(i+1));
            name[i] = sc.next();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if((name[i].compareTo(name[j])) > 0)
                {
                    String temp;
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }

        System.out.println("After Sorting cities in Ascending order:");
        for(int i=0; i<n; i++)
        {
            System.out.println(name[i]);
        }
    }
}


/* output:
Enter the number of cities:
5

Enter the name of city :1
pune
Enter the name of city :2
satara
Enter the name of city :3
koti
Enter the name of city :4
ahamadabad
Enter the name of city :5
ahamadanagar

After Sorting cities in Ascending order:
ahamadabad
ahamadanagar
koti
pune
satara

 */