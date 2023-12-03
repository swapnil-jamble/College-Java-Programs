/*
 Write a program to define a class Account having members custname, accno.
 Define default and parameterized constructor.
 Create a subclass called SavingAccount with member savingbal, minbal.

 Create a derived class AccountDetail that extends the class SavingAccount with
 members, depositamt and withdrawalamt.
 Write a appropriate method to display customer details.

 */

class Account
{
    int accno;
    String custname;

    Account()
    {}
    Account(int accno, String custname)
    {
        this.accno = accno;
        this.custname = custname;
    }
    void display()
    {
        System.out.println("Account number :"+accno+" Customer Name :"+custname);
    }

}
class SavingAccount extends Account
{
    float savingbal,minbal;

    SavingAccount(int accno, String custname,float savingbal, float minbal)
    {
        super(accno,custname);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
    void display()
    {
        super.display();
        System.out.println("saving balance :"+savingbal+" minimum balance :"+minbal);
    }

}

public class AccountDetail extends SavingAccount
{
    float depositamt,withdrawamt;

    AccountDetail(int accno, String custname,float savingbal, float minbal,float depositamt, float withdrawamt)
    {
        super(accno,custname,savingbal,minbal);
        this.depositamt = depositamt;
        this.withdrawamt = withdrawamt;

    }
    void display()
    {
        super.display();
        System.out.println("Deposit Amount :"+depositamt+" Withdraw Amount :"+withdrawamt);
    }

    public static void main(String[] args) {
        AccountDetail customer = new AccountDetail(50395388,"kemal soyadare",1000,5000,700,1000);
        customer.display();
    }
}

/*OUTPUT:

Account number:50395388 Customer Name:kemal soyadare
saving balance :1000.0 minimum balance :5000.0
Deposit Amount :700.0 Withdraw Amount :1000.0
 */