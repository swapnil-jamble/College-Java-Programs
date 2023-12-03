import java.sql.*;
import java.util.*;
import java.text.*;

public class Datting1 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","");
        PreparedStatement pst = con.prepareStatement("insert into datting values(?,?)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the date(dd-mm-yyyy):");
        String d = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        java.util.Date udate = sdf.parse(d);
        long l = udate.getTime();

        java.sql.Date sdate = new java.sql.Date(l);

        pst.setString(1,name);
        pst.setDate(2,sdate);
        int rc = pst.executeUpdate();
        if(rc==0)
            System.out.println("record not inserted..");
        else
            System.out.println("record is inserted....");
        con.close();

    }
}
