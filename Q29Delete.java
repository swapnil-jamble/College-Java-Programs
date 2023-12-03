/*
29)	Write a Java program to delete the details of given employee (ENo EName Salary).
Accept employee ID through command line. (Use PreparedStatement Interface)
 */

import java.sql.*;
public class Q29Delete {
    public static void main(String[] args) throws Exception{
         String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";   //String jdbc_url = "jdbc:postgresql//172.16.6.1/ty50";
         String user = "root";                                        //  String user = "ty50";
         String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver"); // Class.forName("org.postgresql.Driver");

        int id = Integer.parseInt(args[0]);
       // int id = 2;
        String query = "delete from employee1 where eid = '"+id+"'";
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        Statement st = con.createStatement();
        int delete = st.executeUpdate(query);
        System.out.println("No of rows deleted:"+delete);

    }
}

/* OUTPUT:
MariaDB [java_jdbc]> select * from employee1;
+------+---------+---------+
| eid  | ename   | esalary |
+------+---------+---------+
|    1 | swapnil |    8999 |
|    2 | omu     |     999 |
|    3 | avi     |     888 |
+------+---------+---------+

PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac Q29Delete.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java Q29Delete 2
No of rows deleted:1

MariaDB [java_jdbc]> select * from employee1;
+------+---------+---------+
| eid  | ename   | esalary |
+------+---------+---------+
|    1 | swapnil |    8999 |
|    3 | avi     |     888 |
+------+---------+---------+
2 rows in set (0.001 sec)

 */