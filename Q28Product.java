/*
28)	Write a java program for the following:
i. To create a Product(Pid, Pname, Price) table.
 ii. Insert at least five records into the table.
  iii. Display all the records from a table.
 */

import java.sql.*;
import java.util.Scanner;

public class Q28Product {
    public static void main(String[] args) throws Exception {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";
        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        Scanner sc = new Scanner(System.in);

        String createTable = "create table product(id int, name varchar(100),price int)";
        Statement st = con.createStatement();
        int created = st.executeUpdate(createTable);
        if (created == 0)
            System.out.println("Table Product is created...");

        int choice;
        do {
            System.out.println("1. Insert \n 2.display \n 3. Exit");
            System.out.println("Enter ur choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String query2 = "insert into product(id,name,price)values(?,?,?)";
                    PreparedStatement pst = con.prepareStatement(query2);

                    System.out.println("Enter the  id:");
                    int id = sc.nextInt();
                    System.out.println("Enter the  name:");
                    String name = sc.next();
                    System.out.println("Enter the price:");
                    int price = sc.nextInt();

                    pst.setInt(1, id);
                    pst.setString(2, name);
                    pst.setInt(3, price);
                    pst.executeUpdate();
                    break;

                case 2:
                    String select = "select * from product";
                    Statement st1 = con.createStatement();
                    ResultSet rs = st1.executeQuery(select);

                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                    }
                    break;


            }
        } while (choice != 3);
    }
}

/* OUTPUT:
Table Product is created...
1. Insert
 2.display
 3. Exit
Enter ur choice:
1
Enter the  id:
1
Enter the  name:
mobile
Enter the price:
15000
1. Insert
 2.display
 3. Exit
Enter ur choice:
1
Enter the  id:
2
Enter the  name:
laptop
Enter the price:
50000
1. Insert
 2.display
 3. Exit
Enter ur choice:
1
Enter the  id:
3
Enter the  name:
shirt
Enter the price:
500
1. Insert
 2.display
 3. Exit
Enter ur choice:
1
Enter the  id:
5
Enter the  name:
soap
Enter the price:
10
1. Insert
 2.display
 3. Exit
Enter ur choice:
2
1 mobile 15000
2 laptop 50000
3 shirt 500
5 soap 10
1. Insert
 2.display
 3. Exit
Enter ur choice:

 */