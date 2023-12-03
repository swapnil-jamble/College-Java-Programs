import java.sql.*;

public class jdbc_selectQuery {
    public static void main(String[] args) throws  Exception{

        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";
        String user = "root";
        String pwd = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
        Statement st = con.createStatement();

        String sqlQuery = "select * from employee";

        ResultSet rs = st.executeQuery(sqlQuery);
        System.out.println("employee Info:a");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getString(3));
        }
    }
}
