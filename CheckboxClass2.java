import java.awt.*;
import java.awt.event.*;

public class CheckboxClass2 extends Frame implements ActionListener {

    Button ok;
    Label msg;
    Checkbox c1,c2,c3;

    CheckboxClass2()
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

        ok.addActionListener(this);     // addActionListener is used identify BUTTON is on or off

        c1.addItemListener(new MyItem());       // addItemListener is used to identify CHECKBOX is on or off
        c2.addItemListener(new MyItem());
        c3.addItemListener(new MyItem());

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
        CheckboxClass2 obj = new CheckboxClass2();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==ok)
            System.out.println("Clicked on ok.. ");
    }

    class MyItem implements ItemListener
    {
        public void itemStateChanged(ItemEvent ie)
        {
            System.out.println(ie.getItem() +" is clicked..");
        }

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
