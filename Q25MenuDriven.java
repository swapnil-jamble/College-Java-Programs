import java.sql.*;
import java.util.Scanner;
import java.util.function.Predicate;

/*25)	Create a Employee table with fields empid, empname,
empsalary. Insert values in the table. Write a menu driven program to perform the following operations on Employee table.
1.	View All 2. Search 3. Exit

 */
public class Q25MenuDriven {
    public static void main(String[] args) throws Exception{
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";
        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        Scanner sc = new Scanner(System.in);

        String query = "create table employee1(eid int,ename varchar(100),esalary int)";

        Statement st = con.createStatement();
        st.executeUpdate(query);


          int choice;
        do {
            System.out.println("1.view all\n 2.search \n3. Insert \n 4. Exit");
            System.out.println("Enter ur choice:");
             choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                       String select = "select * from employee1";
                       Statement st1 = con.createStatement();
                       ResultSet rs =  st1.executeQuery(select);

                       while(rs.next())
                       {
                           System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
                       }
                       break;

                case 2 :
                    String search = "select * from employee1 where eid =?";
                    PreparedStatement pst1 = con.prepareStatement(search);
                    System.out.println("Enter the employee id which u want to be searched:");
                    int id = sc.nextInt();

                    pst1.setInt(1,id);
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next())
                    {
                        System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3));
                    }


                    break;

                case 3:
                    String query2 = "insert into employee1(eid,ename,esalary)values(?,?,?)";
                    PreparedStatement pst = con.prepareStatement(query2);

                    System.out.println("Enter the emp id:");
                    int eid = sc.nextInt();
                    System.out.println("Enter the emp name:");
                    String ename = sc.next();
                    System.out.println("Enter the emp salary:");
                    int esalary = sc.nextInt();

                    pst.setInt(1,eid);
                    pst.setString(2,ename);
                    pst.setDouble(3,esalary);
                    pst.executeUpdate();
            }
        }while(choice!=4);

    }
}

/*
OUTPUT:
1.view all
 2.search
3. Insert
 4. Exit
Enter ur choice:
3
Enter the emp id:
1
Enter the emp name:
swapnil
Enter the emp salary:
8999
1.view all
 2.search
3. Insert
 4. Exit
Enter ur choice:
3
Enter the emp id:
2
Enter the emp name:
omu
Enter the emp salary:
999
1.view all
 2.search
3. Insert
 4. Exit
Enter ur choice:
3
Enter the emp id:
3
Enter the emp name:
avi
Enter the emp salary:
888
1.view all
 2.search
3. Insert
 4. Exit
Enter ur choice:
1
1 swapnil 8999
2 omu 999
3 avi 888
1.view all
 2.search
3. Insert
 4. Exit
Enter ur choice:
2
Enter the employee id which u want to be searched:
1
1 swapnil 8999
1.view all
 2.search
3. Insert
 4. Exit
 */