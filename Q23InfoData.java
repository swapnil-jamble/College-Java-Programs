/*23)	Write a program to display information about the database and list all the tables in the database. (Use DatabaseMetaData).

 */

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Q23InfoData {
    public static void main(String[] args) throws Exception {
        String jdbc_url = "jdbc:mysql://localhost:3306/java_jdbc";        // String jdbc_url = "jdbc:postgresql://172.16.6.1/ty50";
        String user = "root";                               // String user = "ty50";
        String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");      //  " Class.forName("org.postgresql.Driver";

        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        DatabaseMetaData dbms = con.getMetaData();
        ResultSet rs = dbms.getTables(null, null, null, new String[]{"TABLE"});
        System.out.println("List of Tables:");
        while (rs.next()) {
            String tblName = rs.getString("TABLE_NAME");
            System.out.println("Table:" + tblName);
        }
        con.close();
    }
}

/*
List of Tables:
Table:activity_log
Table:answer
Table:assignment
Table:class
Table:class_quiz
Table:class_subject_overview
Table:content
Table:department
Table:event
Table:files
Table:message
Table:message_sent
Table:notification
Table:notification_read
Table:notification_read_teacher
Table:question_type

 */