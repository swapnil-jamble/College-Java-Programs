import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;


public class Label3 extends Frame implements ActionListener {
    Button b1,b2,b3,b4,b5,b6;
    Label3()
    {
        setTitle("myGridlayout");
        setSize(300,300);
        setVisible(true);

        setLayout(new GridLayout(3,2,10,10));

        b1 = new Button("b1");
        b2 = new Button("b2");
        b3 = new Button("b3");
        b4 = new Button("b4");
        b5 = new Button("b5");
        b6 = new Button("b6");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);


        addWindowListener(new Mywindow());
    }


    public static void main(String[] args) {
        Label3 obj =new Label3();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
            System.out.println("b1 is clicked..");
        if(ae.getSource() == b2)
            System.out.println("b2 is clicked..");
        if(ae.getSource() == b3)
            System.out.println("b3 is clicked..");
        if(ae.getSource() == b4)
            System.out.println("b4 is clicked..");
        if(ae.getSource() == b5)
            System.out.println("b5 is clicked..");
        if(ae.getSource() == b6)
            System.out.println("b6 is clicked..");

    }


    class Mywindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("window is closed");
        }
    }
}
