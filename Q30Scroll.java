/*30)	Write a Java Program for the implementation of scrollable ResultSet.
 Assume Teacher table with attributes (TID, TName, Salary) is already created.
 */

import java.sql.*;

public class Q30Scroll {


    public static void main(String[] args) throws Exception {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";   //String jdbc_url = "jdbc:postgresql//172.16.6.1/ty50";
        String user = "root";                                        //  String user = "ty50";
        String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver"); // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = st.executeQuery("select * from teacher");
        System.out.println("RECORDS IN THE TABLE...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+rs.getInt(3));
        }

        rs.first();
        System.out.println("FIRST RECORD...");
        System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getInt(3));

        rs.absolute(3);
        System.out.println("THIRD RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+rs.getInt(3));

        rs.last();
        System.out.println("LAST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+rs.getInt(3));

        rs.previous();
        rs.relative(-1);
        System.out.println("LAST TO FIRST RECORD...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+" "+rs.getInt(3));
        con.close();
    }

}

/* OUTPUT:
RECORDS IN THE TABLE...
1 -> swapnil 97
2 -> nil 973
3 -> omu 933
4 -> avi 33
5 -> wednesday 400
6 -> day 400
FIRST RECORD...
1 swapnil 97
THIRD RECORD...
3 -> omu 933
LAST RECORD...
6 -> day 400
LAST TO FIRST RECORD...
4 -> avi 33

 */