// 2. Write a Java program to accept the details of Employee (Eno, EName, Designation,
//Salary) from a user and store it into the database. (Use Swing)


import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;
        import java.sql.*;
public class Slip1B  extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b;
    Connection cn;
    Statement st;
    ResultSet rs;
    public Slip1B()
    {
        setLayout(null);
        l1=new Label("Eno");
        l2=new Label("Ename");
        l3=new Label("Salary");
        l4=new Label("Edesignation");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();

        b=new Button("Save");
        l1.setBounds(50,50,100,30);
        t1.setBounds(160,50,100,30);
        l2.setBounds(50,90,100,30);
        t2.setBounds(160,90,100,30);
        l3.setBounds(50,130,100,30);
        t3.setBounds(160,130,100,30);
        l4.setBounds(50,170,100,30);
        t4.setBounds(160,170,100,30);

        b.setBounds(50,210,100,30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b);

        b.addActionListener(this);
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent oe)
    {
        String str=oe.getActionCommand();
        if(str.equals("Save"))
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc","root","");
                st =cn.createStatement();

                int eno = Integer.parseInt(t1.getText());
                String ename = t2.getText();
                int esalary = Integer.parseInt(t3.getText());
                String edes = t4.getText();

                String strr= "insert into emp values(" + eno + " ,'" + ename + "'," + esalary + ",'" + edes +"')";
                int k=st.executeUpdate(strr);
                if(k>0)
                {

                    JOptionPane.showMessageDialog(null,"Record Is Added");
                }
            }
            catch(Exception er)
            {
                System.out.println(er);
            }
        }
    }
    public static void main(String args[])
    {
        Slip1B sb = new Slip1B();

    }
}

/*
OUTPUT:
MariaDB [java_jdbc]> select * from emp;
+-----+-------+---------+---------+
| eno | ename | esalary | edes    |
+-----+-------+---------+---------+
|   1 | nil   |     100 | Hr      |
|   2 | omu   |       1 | Manager |
|   3 | om    |     199 | boss    |
+-----+-------+---------+---------+
3 rows in set (0.001 sec)
 */