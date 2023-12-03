/*
 Define an abstract class Staff with protected members id and name.
Define a parameterized constructor. Define one subclass OfficeStaff
with member department. Create n objects of OfficeStaff and display all
details
 */

import java.util.Scanner;

abstract class Staff
{
    protected  int id;
    protected  String name;
     Staff(int id, String name)
     {
         this.id = id;
         this.name = name;
     }
     abstract void display();
}

public class Abstract_Staff extends Staff                   // class OfficeStaff
{
    String dep;

    Abstract_Staff(int id, String name, String dep) {
        super(id, name);
        this.dep = dep;
    }
    void display()
    {
        System.out.println("\n id :"+id+" \tName :"+name+" \tDepartment :"+dep);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many object u want to created:");
        int n = sc.nextInt();

        Abstract_Staff obj[] = new Abstract_Staff[n];

        System.out.println("Enter the Office staff detail:");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the id of Employee :"+(i+1));
            int id = sc.nextInt();

            System.out.println("Enter the name of the Employee :"+(i+1));
            String name = sc.next();

            System.out.println("Enter the name of the Department of Employee:"+(i+1));
            String dep = sc.next();

            obj[i] = new Abstract_Staff(id, name, dep);

        }

        System.out.println("Displaying all detail of Employee:");
        for(int i=0; i<n; i++)
        {
            obj[i].display();
        }
    }
}
/* Output:
Enter the how many object u want to created:
3

Enter the Office staff detail:
Enter the id of Employee :1
1
Enter the name of the Employee :1
Swapnil
Enter the name of the Department of Employee:1
CodingWallah

Enter the id of Employee :2
2
Enter the name of the Employee :2
Saurabh
Enter the name of the Department of Employee:2
MathsWallah

Enter the id of Employee :3
3
Enter the name of the Employee :3
Abhi
Enter the name of the Department of Employee:3
ChemistryWallah

Displaying all detail of Employee:

 id :1 	Name :Swapnil 	Department :CodingWallah

 id :2 	Name :Saurabh 	Department :MathsWallah

 id :3 	Name :Abhi 	Department :ChemistryWallah
 */