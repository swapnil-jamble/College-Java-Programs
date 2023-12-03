import java.sql.*;
public class jdbc_dropTable {
    public static void main(String[] args)  throws Exception
    {
        String jdbc_url ="jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        Statement st = con.createStatement();

        String sqlQuery = "drop table student";
        st.executeUpdate(sqlQuery);
        System.out.println("Table deleted Successfully");
        st.close();
    }
}
