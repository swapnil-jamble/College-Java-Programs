import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxClass extends Frame implements ActionListener {

    Button ok;
    Label msg;
    Checkbox c1,c2,c3;

    CheckboxClass()
    {
        setMethod();

        setTitle("mycheckbox");
        setSize(300,300);
        setVisible(true);
        setLayout(new GridLayout(5,1,10,20));

        add(msg);
        add(c1);
        add(c2);
        add(c3);
        add(ok);

        ok.addActionListener(this);


        addWindowListener(new mylistener());
    }

    private void setMethod()
    {
        c1 = new Checkbox("c");
        c2 = new Checkbox("c++");
        c3 = new Checkbox("java");

        msg = new Label("Select Languages:");
        ok = new Button("ok");
    }




    public static void main(String [] args)
    {
        CheckboxClass obj = new CheckboxClass();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==ok)
            System.out.println("Clicked on ok.. ");

        if(true == c1.getState())
            System.out.println("click on "+c1.getLabel());
        if(true == c2.getState())
            System.out.println("click on c++");
        if(true == c3.getState())
            System.out.println("click on java");
    }


    class mylistener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("window is closed...");
        }
    }



}
