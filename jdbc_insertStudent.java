import java.sql.*;
import java.util.Scanner;

public class jdbc_insertStudent {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";
        
        String driver_class = "com.mysql.cj.jdbc.Driver";
        String sqlQuery = "insert into student (id,name,percentage)values(?,?,?)";
        
        Class.forName(driver_class);
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        PreparedStatement pst = con.prepareStatement(sqlQuery);
        System.out.println("Enter the Student id:");
        int id = sc.nextInt();
        System.out.println("Enter the Student name:");
        String name = sc.next();
        System.out.println("Enter the Student percentage:");
        Double percentage = sc.nextDouble();
        
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setDouble(3,percentage);
        pst.executeUpdate();
        
        
    }
}
