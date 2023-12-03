

    import java.sql.*;
import java.io.*;
import java.util.*;
    public class jdbc_insetEmp
    {
        public static void main(String[] args) throws Exception,SQLException, IOException {

            ResultSet rs = null;
            PreparedStatement ps1 = null, ps2=null;
            Connection conn = null;
            int id;
            String name;
            double percentage;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
            String user = "root";
            String pwd = "";

            Scanner sc = new Scanner(System.in);
            String driver_class = "com.mysql.cj.jdbc.Driver";

            Class.forName(driver_class);
            Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
            Statement st = con.createStatement();
            ps1 = con.prepareStatement("Insert into student values(?,?,?)");

            if(con!=null)
                System.out.println("Connection successful..");
            System.out.println("Enter the employee ID, employee name and employee salary to be inserted ");
                    id = sc.nextInt();
            name = sc.next();
            percentage = sc.nextDouble();

            ps1.setInt(1,id);
            ps1.setString(2,name);
           ps1.setDouble(3,percentage);
            ps1.executeUpdate();

            con.close();
        }//end of main
    }// end of clas
