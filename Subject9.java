/*9.	Write a java program to accept ‘N’ Subject Names from a user store them into LinkedList Collection
 and Display them by using Iterator interface.

 */


import java.util.Scanner;
        import java.util.*;

public class Subject9 {

    public static void main(String[] args) {
        LinkedList t = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int n = sc.nextInt();

        System.out.println("Enter the subjects:");
        for(int i=0; i<n; i++)
        {
            t.add(sc.next());
        }

        System.out.println(t);
        Iterator it = t.iterator();
        System.out.println("The subjects using Iterator:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
/*
OUTPUT:
Enter the no of subjects:
5
Enter the subjects:
math
english
art
AI
sketch
[math, english, art, AI, sketch]
The subjects using Iterator:
math
english
art
AI
sketch
 */