import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.FlowLayout;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;



public class Label2 extends  Frame{
    Button submit;
    Label emailLabel, passLabel;
    TextField email,password;
    char ch='*';

    Label2() {
        setTitle("mylabel");
        setBounds(500,0,500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        submit = new Button("Submit");

        emailLabel = new Label("Enter Email:");
        passLabel = new Label("Enter Password:");
        email = new TextField(20);
        password = new TextField(20);
        password.setEchoChar(ch);

        add(emailLabel);
        add(email);
        add(passLabel);
        add(password);
        add(submit);

        addWindowListener(new Mywindow());

    }
    public static void main(String [] args)
    {
        Label2 obj = new Label2();
    }


    class Mywindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("Window is closed..");
        }
    }

}
