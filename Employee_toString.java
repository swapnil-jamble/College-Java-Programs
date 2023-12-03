/*
Write a program to display the Employee(Empid, Empname,
Empdesignation, Empsal) information using toString().

 */

public class Employee_toString {
    int Empid;
    String Empname, Empdesignation;
    float Empsal;

    Employee_toString(int Empid,String Empname,String Empdesignation,float Empsal)
    {
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empdesignation = Empdesignation;
        this.Empsal = Empsal;
    }
    public String toString()
    {
        return "\nEmployee id :"+Empid+" \tEmployee Name :"+Empname+"\t Employee Designation :"+Empdesignation+"\t Employee Salary :"+Empsal;
    }

    public static void main(String[] args) {
        Employee_toString obj = new Employee_toString(100,"Swapnil","London",50000);
        Employee_toString obj1 = new Employee_toString(101,"Saurabh","London",55000);
        Employee_toString obj2 = new Employee_toString(102,"Omkar","France",10000);
        Employee_toString obj3 = new Employee_toString(103,"Abhi","America",44000);

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }

}
/* OUTPUT

Employee id :100 	Employee Name :Swapnil	 Employee Designation :London	 Employee Salary :50000.0

Employee id :101 	Employee Name :Saurabh	 Employee Designation :London	 Employee Salary :55000.0

Employee id :102 	Employee Name :Omkar	 Employee Designation :France	 Employee Salary :10000.0

Employee id :103 	Employee Name :Abhi	 Employee Designation :America	 Employee Salary :44000.0
 */