import java.sql.*;
import java.util.Scanner;

public class jdbc_databaseInfo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";

        String driver_class = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver_class);
        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        DatabaseMetaData dbms = con.getMetaData();
        ResultSet rs = dbms.getTables(null, null, null, new String[]{"TABLE"});
        System.out.println("List of Tables:");
        while (rs.next()) {
            String tblName = rs.getString("TABLE_NAME");
            System.out.println("Table:" + tblName);
        }
     con.close();
    }
}