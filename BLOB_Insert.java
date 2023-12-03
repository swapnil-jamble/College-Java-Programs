import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class BLOB_Insert {
    public static void main(String[] args) throws  Exception{

           File f = new File("C:\\Users\\jambl\\IdeaProjects\\MyProject\\src\\nil.png");


           FileInputStream fis = new FileInputStream(f);


           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc", "root", "");
           PreparedStatement pst = con.prepareStatement("insert into video values(?,?)");

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the naem:");
           String name = sc.next();
           pst.setString(1, name);
           pst.setBinaryStream(2, fis);
           int rc = pst.executeUpdate();
           if (rc == 0)
               System.out.println("rocord is not inserted..");
           else
               System.out.println("record is inserted...");

    }
}
