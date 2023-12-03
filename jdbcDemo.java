

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) {


        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nil_event","root","");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from customer");

            System.out.println("Username\t email \t password");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            conn.close();
        }
        catch(Exception e){
        System.out.println(e);
    }
    }

}
