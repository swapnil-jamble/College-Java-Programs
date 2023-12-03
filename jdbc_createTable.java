import java.util.*;
import java.sql.*;



public class jdbc_createTable
{
    public static void main(String[] args) throws Exception
    {
                String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
                String user = "root";
                String pwd = "";

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(jdbc_url,user,pwd);

                String sqlQuery = "create table student(sno int , sname varchar(100))";
                Statement st = con.createStatement();
                st.executeUpdate(sqlQuery);

                System.out.println("table created successfully");


    }
}
