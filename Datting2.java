import java.sql.*;
import java.util.*;
import java.text.*;

public class Datting2 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","");
        PreparedStatement pst = con.prepareStatement("select * from datting");
        ResultSet rs = pst.executeQuery();

        while(rs.next())
        {
            System.out.println(rs.getString(1)+"    "+rs.getDate(2));
        }

        con.close();

    }
}
