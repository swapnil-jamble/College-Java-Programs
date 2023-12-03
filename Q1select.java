/*1)	Write a program to display Student table data (rollno, name,  mobno, percentage)

 */

import java.sql.*;
public class Q1select {
    public static void main(String[] args) throws Exception
    {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        Statement st = con.createStatement();
        String query = "select * from student";

        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getDouble(3)+" "+rs.getInt(4));
        }
        con.close();
    }
}

/*OUTPUT:
1 nil 88.3 343
22 sd 33.0 0
2 om 88.34 444
3 nill 33.3 453
5 raju 34.0 657
8 dk 76.0 656

 */