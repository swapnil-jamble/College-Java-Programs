import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.FlowLayout;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;



public class Label1 extends  Frame{
    Button submit;
    Label emailLabel, passLabel;
    TextField email,password;


    Label1() {
        setTitle("mylabel");
        setSize(200, 400);
        setVisible(true);
        setLayout(new FlowLayout());

        submit = new Button("Submit");

        emailLabel = new Label("Enter Email:");
        passLabel = new Label("Enter Password:");

        email = new TextField(20);
        password = new TextField(20);

        add(emailLabel);
        add(email);
        add(passLabel);
        add(password);
        add(submit);

        addWindowListener(new Mywindow());

    }
    public static void main(String [] args)
    {
        Label1 obj = new Label1();
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
