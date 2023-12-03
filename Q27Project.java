/*27)	Create a Project table with fields Proj_id, Proj_name, Proj_status.
Insert values in the table. Write a menu driven program to perform the following operations on Project table.
2.	Insert 2. Delete 3. Exit

 */

import java.sql.*;
import java.util.Scanner;

public class Q27Project {


    public static void main(String[] args) throws Exception{

        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";
        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        Scanner sc = new Scanner(System.in);

        String query = "create table project(id int,name varchar(100),status varchar(100))";

        Statement st = con.createStatement();
        st.executeUpdate(query);


        int choice;
        do {
            System.out.println("1. Insert \n 2.delete \n 3. Exit");
            System.out.println("Enter ur choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    String query2 = "insert into project(id,name,status)values(?,?,?)";
                    PreparedStatement pst = con.prepareStatement(query2);

                    System.out.println("Enter the  id:");
                    int id = sc.nextInt();
                    System.out.println("Enter the  name:");
                    String name = sc.next();
                    System.out.println("Enter the status [complete/NotComplete]:");
                    String status = sc.next();

                    pst.setInt(1,id);
                    pst.setString(2,name);
                    pst.setString(3,status);
                    pst.executeUpdate();
                    break;

                case 2 :
                    String search = "delete from project where id =?";
                    PreparedStatement pst1 = con.prepareStatement(search);
                    System.out.println("Enter the project id which u want to be delete:");
                    int pid = sc.nextInt();

                    pst1.setInt(1,pid);
                    int delete = pst1.executeUpdate();
                    System.out.println("no of rows deleted:"+delete);
                    break;


            }
        }while(choice!=3);

    }
}

/*
1. Insert
 2.delete
 3. Exit
Enter ur choice:
1
Enter the  id:
1
Enter the  name:
swapnil
Enter the status [complete/NotComplete]:
NotComplete
1. Insert
 2.delete
 3. Exit
Enter ur choice:
1
Enter the  id:
2
Enter the  name:
omu
Enter the status [complete/NotComplete]:
complete
1. Insert
 2.delete
 3. Exit
Enter ur choice:
1
Enter the  id:
3
Enter the  name:
avi
Enter the status [complete/NotComplete]:
complete
1. Insert
 2.delete
 3. Exit
Enter ur choice:
1
Enter the  id:
44
Enter the  name:
wednesday
Enter the status [complete/NotComplete]:
complete
1. Insert
 2.delete
 3. Exit
Enter ur choice:
2
Enter the project id which u want to be delete:
2
no of rows deleted:1
1. Insert
 2.delete
 3. Exit

 +------+-----------+-------------+
| id   | name      | status      |
+------+-----------+-------------+
|    1 | swapnil   | NotComplete |
|    3 | avi       | complete    |
|   44 | wednesday | complete    |
+------+-----------+-------------+
 */