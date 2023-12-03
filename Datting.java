import java.sql.*;
import java.util.*;


public class Datting {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","");
        PreparedStatement pst = con.prepareStatement("insert into datting values(?,?)");
        System.out.println("Enter the date(yyyy-mm-dd):");
        Scanner sc = new Scanner(System.in);
        String d = sc.next();

        java.util.Date udate = new java.util.Date();
        long l = udate.getTime();

        java.sql.Date sdate = new java.sql.Date(l);

        pst.setString(1,"day");
        pst.setDate(2,sdate);
        int rc = pst.executeUpdate();
        if(rc==0)
            System.out.println("record not inserted..");
        else
            System.out.println("record is inserted....");
        con.close();

    }
}
