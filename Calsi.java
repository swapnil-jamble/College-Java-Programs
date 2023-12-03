import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calsi extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    JTextField txt= new JTextField(10);

    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bsum = new JButton("+");
    JButton bsub = new JButton("-");
    JButton bmul = new JButton("*");
    JButton bdiv = new JButton("/");
    JButton bdot = new JButton(".");
    JButton bequal = new JButton("=");
    JButton bclear = new JButton("Clr");

    String Oprt = "",str = "";
    Float f1,f2;


    Calsi()
    {
        prepareFrame();
        addComponents();
        addActionEvents();

    }
    void prepareFrame()
    {
        setTitle("Calsi");
        setSize(300,300);
        setVisible(true);
        setLayout(new GridLayout());
        addWindowListener(new MyWindow() );

    }

    void addComponents()
    {
        p1.add(txt);
        p2.add(b0);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bsum);
        p2.add(bsub);
        p2.add(bmul);
        p2.add(bdiv);
        p2.add(bdot);
        p2.add(bequal);
        p2.add(bclear);

        add(p1);
        add(p2);

    }
    
    void addActionEvents()
    {
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bsum.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdot.addActionListener(this);
        bequal.addActionListener(this);
        bclear.addActionListener(this);





    }


    public static void main(String[] args)

    {
        Calsi obj = new Calsi();
    }
    
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource() == b0)
             str = str + b0.getText();
        if(e.getSource() == b1)
            str = str + b1.getText();
        if(e.getSource() == b2)
            str = str + b2.getText();
        if(e.getSource() == b3)
            str = str + b3.getText();
        if(e.getSource() == b4)
            str = str + b4.getText();
        if(e.getSource() == b5)
            str = str + b5.getText();
        if(e.getSource() == b6)
            str = str + b6.getText();
        if(e.getSource() == b7)
            str = str + b7.getText();
        if(e.getSource() == b8)
            str = str + b8.getText();
        if(e.getSource() == b9)
            str = str + b9.getText();
        if(e.getSource() == bdot)
            str = str + bdot.getText();


       txt.setText(str);

        if(e.getSource() == bsum)
        {
            Oprt = "+";
            txt.setText(Oprt);
            f1 = Float.parseFloat(str);
            str = "";
        }
        if(e.getSource() == bequal)
        {
            if(Oprt.equals("+"))
            {
                f2 = Float.parseFloat(str);
                txt.setText(( f1+f2 ) + "");
                str = "";
            }
        }

      else if(e.getSource() == bsub)
        {
            Oprt = "-";
            txt.setText(Oprt);
            f1 = Float.parseFloat(str);
            str = "";
        }
        if(e.getSource() == bequal)
        {
            if(Oprt.equals("-"))
            {
                f2 = Float.parseFloat(str);
                txt.setText(( f1-f2 ) + "");
                str = "";
            }
        }

       else if (e.getSource() == bmul) {
            Oprt = "*";
            txt.setText("");
            f1 = Float.parseFloat(str);
            str = "";
        }
        if (e.getSource() == bequal) {
            if (Oprt.equals("*")) {
                f2 = Float.parseFloat(str);
                txt.setText((f1 * f2) + "");
                str = "";
            }
        }

       else if (e.getSource() == bdiv) {
            Oprt = "/";
            txt.setText("");
            f1 = Float.parseFloat(str);
            str = "";
        }
        if (e.getSource() == bequal) {
            if (Oprt.equals("/")) {
                f2 = Float.parseFloat(str);
                txt.setText((f1 / f2) + "");
                str = "";
            }
        }

        if (e.getSource() == bclear)
        {
            txt.setText("");
            str = "";
            f1 = null;
            f2 = null;
        }
        
    }
    
    

    class MyWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("Window is closed..");
        }

    }
}
