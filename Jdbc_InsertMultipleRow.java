import java.util.*;
import java.sql.*;

public class Jdbc_InsertMultipleRow {
    public static void main(String[] args) throws Exception
    {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);

        Statement st = con.createStatement();

        while(true)
        {
            System.out.println("Enter Employee No :");
            int eno = sc.nextInt();
            System.out.println("Enter Employee Name:");
            String ename = sc.next();
            System.out.println("Enter Employee Salary:");
            double esal = sc.nextDouble();
            System.out.println("Enter Employee Address:");
            String eaddr = sc.next();

          //  String sqlQuery = "insert into employee values ("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')";         // Traditional / difficult approach
              String sqlQuery = String.format("insert into employee values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr); // new easy approach
            st.executeUpdate(sqlQuery);
            System.out.println("inserted successfully");

            System.out.println("Do u want insert one more row:[ Yes/No]:");
            String option = sc.next();

            if(option.equalsIgnoreCase("No"))
            {
                break;
            }
        }

    }

}
