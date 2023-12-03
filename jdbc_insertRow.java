import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class jdbc_insertRow {
    public static void main(String[] args) throws Exception
    {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);

        String sqlQuery = "insert into employee values (1, 'nil',500, 'patas')";
        Statement st = con.createStatement();
        st.executeUpdate(sqlQuery);

        System.out.println("inserted successfully");

    }

}
