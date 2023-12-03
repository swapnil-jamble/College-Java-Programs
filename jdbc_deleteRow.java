import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbc_deleteRow {

    public static void main(String[] args) throws  Exception{

        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        Statement st = con.createStatement();

        String sqlQuery = "delete from employee where eno = 1";

         st.executeUpdate(sqlQuery);
        System.out.println("successfully deleted..");

    }
}

