import java.util.*;

/*5.	Write a Java program to accept ‘n’ integers from the user and store them in a collection.
 Display them in the sorted order. The collection should not accept duplicate elements.
  (Use a suitable collection). Search for a particular element using predefined search method in the Collection framework.

 */
public class IntSort5 {
    public static void main(String[] args) {
        HashSet a = new HashSet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many no of integer u want to be enter:");
        int n = sc.nextInt();

        System.out.println("Enter the "+n+" integers:");
        for(int i=0; i<n; i++)
        {
            a.add(sc.nextInt());
        }

        System.out.println(a);
        TreeSet t = new TreeSet(a);
        System.out.println("After sorting integers:"+t);

        ArrayList ar = new ArrayList(t);
        System.out.println("Enter the search element:");
        int search = sc.nextInt();
        int index = Collections.binarySearch(ar,search);
        System.out.println("element are present at index: "+index);
    }
}


/* OUTPUT:
Enter the how many no of integer u want to be enter:
7
Enter the 7 integers:
77
88
50
55
60
3
2
[50, 2, 3, 55, 88, 60, 77]
After sorting integers:[2, 3, 50, 55, 60, 77, 88]
Enter the search element:
50
element are present at index: 2

 */