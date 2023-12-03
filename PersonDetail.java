/*
Write a program to read the First Name and Last Name of a person,
his weight and height using command line arguments. Calculate the BMI
Index which is defined as the individual's body mass divided by the
square of their height.
(Hint : BMI = Wts. In kgs / (ht) 2
 */

import java.util.Scanner;

public class PersonDetail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Name & Last Name of Person:");
        String fname = sc.next();
        String lname = sc.next();

        float weight = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);

        double BMI = weight / Math.pow(height,2);         // float BMI = float(weight / Math.pow(height,2));

        System.out.println("The BMI of person :"+fname+" "+lname+" is :"+BMI);
    }
}

/*
   OUTPUT:
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac PersonDetail.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java PersonDetail 30 5
Enter the First Name & Last Name of Person:
saurabh
ladkat
The BMI of person :saurabh ladkat is :1.2

 */