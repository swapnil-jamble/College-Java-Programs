import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc_CreateStudent {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava_db","root","");
        PreparedStatement pst1 = con.prepareStatement("create table stud1(id int , name varchar(100),percentage double)");

        pst1.executeUpdate();


    }
}
