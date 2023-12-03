
/*22)	Write a program to perform insert and delete operations
 on employee table using PreparedStatement (Empid, Empname, Empsalary)

 */
import java.sql.*;
import java.util.Scanner;

public class Q22InsetDelete {
    public static void main(String[] args) throws Exception {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";
        String query = "insert into student (id,name,percentage,mno)values(?,?,?,?)";
        String query2 = "delete from student where id =?";

        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";

        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        PreparedStatement pst = con.prepareStatement(query);

        System.out.println("Enter the Student id:");
        int id = sc.nextInt();
        System.out.println("Enter the Student name:");
        String name = sc.next();
        System.out.println("Enter the Student percentage:");
        Double percentage = sc.nextDouble();
        System.out.println("Enter the Student mobile no:");
        int mno = sc.nextInt();

        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setDouble(3,percentage);
        pst.setInt(4,mno);
        pst.executeUpdate();

        PreparedStatement pst2 = con.prepareStatement(query2);
        System.out.println("Enter the id which row u want to delete:");
        int id2 = sc.nextInt();

        pst2.setInt(1,id2);
        pst2.executeUpdate();




    }
}


/*
Enter the Student id:
5
Enter the Student name:
raju
Enter the Student percentage:
34
Enter the Student mobile no:
657
MariaDB [java_jdbc]> select * from student;
+------+------+------------+------+
| id   | name | percentage | mno  |
+------+------+------------+------+
|    1 | nil  |       88.3 |  343 |
|   22 | sd   |         33 | NULL |
|    2 | om   |      88.34 |  444 |
|    3 | nill |       33.3 |  453 |
|    5 | raju |         34 |  657 |
|    6 | omm  |         36 |  677 |
|    6 | omm  |         36 |  677 |
+------+------+------------+------+
7 rows in set (0.000 sec)

Enter the Student id:
8
Enter the Student name:
dk
Enter the Student percentage:
76
Enter the Student mobile no:
656
Enter the id which row u want to delete:
6

MariaDB [java_jdbc]> select * from student;
+------+------+------------+------+
| id   | name | percentage | mno  |
+------+------+------------+------+
|    1 | nil  |       88.3 |  343 |
|   22 | sd   |         33 | NULL |
|    2 | om   |      88.34 |  444 |
|    3 | nill |       33.3 |  453 |
|    5 | raju |         34 |  657 |
|    8 | dk   |         76 |  656 |
+------+------+------------+------+
6 rows in set (0.001 sec)

Enter the Student id:
8
Enter the Student name:
dk
Enter the Student percentage:
76
Enter the Student mobile no:
656
Enter the id which row u want to delete:
6

 */