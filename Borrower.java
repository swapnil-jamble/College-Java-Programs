/*
Design a Super class Customer (name, phone-number).
Derive a class Depositor(accno , balance) from Customer.
Again, derive a class Borrower (loan-no, loan-amt) from Depositor.
Write necessary member functions to read and display the details of ‘n’customers
 */

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

class Customer
{
    String name;
    long phone_no;
    Customer(String name , long phone_no)
    {
        this.name = name;
        this.phone_no = phone_no;
    }
    void display()
    {
        System.out.println("Name :"+name +" Phone no :"+phone_no);
    }
}

class Depositor extends Customer
{
    int accno;
    float balance;

    Depositor(String name, long phone_no, int accno, float balance)
    {
        super(name,phone_no);
        this.accno = accno;
        this.balance = balance;
    }
    void display()
    {
        super.display();
        System.out.println("Account no :"+accno+" Balance :"+balance);
    }
}


public class Borrower extends  Depositor {
    int loanno;
    float loanamt;
    Borrower(String name, long phone_no, int accno, float balance,int loanno,float loanamt)
    {
        super(name,phone_no,accno,balance);
        this.loanno = loanno;
        this.loanamt = loanamt;
    }
    void display()
    {
        super.display();
        System.out.println("Loan no :"+loanno+"Loan amount :"+loanamt);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of person:");
        n = sc.nextInt();

        Borrower per[] = new Borrower[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the Phone no:");
            long phone_no = sc.nextInt();
            System.out.println("Enter the Account number:");
            int accno = sc.nextInt();
            System.out.println("Enter the Balance:");
            float balance = sc.nextFloat();
            System.out.println("Enter the loan number:");
            int loanno = sc.nextInt();
            System.out.println("Enter the loan amount:");
            float loanamt = sc.nextFloat();

            per[i] = new Borrower(name,phone_no,accno,balance,loanno,loanamt);
        }
        System.out.println("Displaying all person Detail:");
        for(int i=0; i<n; i++)
        {
            per[i].display();
        }
    }
}

/* OUTPUT:
Enter the no. of person:
3
Enter the name:
kemal
Enter the Phone no:
97753342
Enter the Account number:
999
Enter the Balance:
10500
Enter the loan number:
100
Enter the loan amount:
1000
Enter the name:
swapnil
Enter the Phone no:
93566780
Enter the Account number:
888
Enter the Balance:
100000
Enter the loan number:
101
Enter the loan amount:
56890
Enter the name:
nihan
Enter the Phone no:
92373294
Enter the Account number:
777
Enter the Balance:
105000
Enter the loan number:
102
Enter the loan amount:
100000

Displaying all person Detail:

Name :kemal       Phone no :97753342
Account no :999   Balance :10500.0
Loan no :100      Loan amount :1000.0

Name :swapnil     Phone no :93566780
Account no :888   Balance :100000.0
Loan no :101      Loan amount :56890.0

Name :nihan       Phone no :92373294
Account no :777   Balance :105000.0
Loan no :102      Loan amount :100000.0
 */
