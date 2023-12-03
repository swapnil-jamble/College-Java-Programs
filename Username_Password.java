/*
Write a program to accept the username and password from user if
username and password are not same then raise "Invalid Password" with
appropriate msg.
 */

import java.util.Scanner;

public class Username_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName,password;
        System.out.println("Enter the user name :");
        userName = sc.next();
        System.out.println("Enter the password :");
        password = sc.next();

        if(userName.equals(password))
            System.out.println("username and password are same...");
        else
            System.out.println("Invalid Password...");

    }
}

/*
Enter the user name :
nislihan
Enter the password :
nislihan
username and password are same...

Or

Enter the user name :
nihan
Enter the password :
nihal
Invalid Password...

 */