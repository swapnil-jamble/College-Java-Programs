

import java.sql.*;
public class Q24Column {
    public static void main(String args[]){
        try{
            String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
            String user = "root";                               // String user = "ty50";
            String pwd = "";
            Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";
            Connection con = DriverManager.getConnection(jdbc_url, user, pwd);

            PreparedStatement ps=con.prepareStatement("select * from student");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: " + rsmd.getColumnCount());

            int i=1;
            while(rs.next()) {

                System.out.println("Column Name of 1st column: " + rsmd.getColumnName(i));
                System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(i));
                i++;
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

/*
Total columns: 4
Column Name of 1st column: id
Column Type Name of 1st column: INT
Column Name of 1st column: name
Column Type Name of 1st column: VARCHAR
Column Name of 1st column: percentage
Column Type Name of 1st column: DOUBLE
Column Name of 1st column: mno
Column Type Name of 1st column: INT
java.sql.SQLException: Column index out of range.

 */