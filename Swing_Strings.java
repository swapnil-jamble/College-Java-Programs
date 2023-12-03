/*
Write Java program to design three text boxes and two buttons using swing.
 Enter different strings in first and second textbox.
 On clicking the First command button, concatenation of two strings should
be displayed in third text box and
on clicking second command button, reverse of string should display in third text box

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Swing_Strings extends JFrame implements ActionListener
{
   JTextField text1 = new JTextField(8);
   JTextField text2 = new JTextField(8);
   JTextField text3 = new JTextField(8);
   JButton Bconcat = new JButton("concat");
   JButton Breverse = new JButton("reverse");
   JPanel p1 = new JPanel();
   JPanel p2 = new JPanel();
   JPanel p3 = new JPanel();
   String str;

    Swing_Strings()
    {
        prepareFrame();
        addComponents();
        addActionEvents();
    }
    void prepareFrame()
    {
        setTitle("MYSwing");
        setSize(300,300);
        setVisible(true);
        setLayout(new GridLayout());
        addWindowListener(new MyWindow() );

    }

    void addComponents()
    {
        p1.add(text1);
        p1.add(text2);

        p2.add(Bconcat);
        p2.add(Breverse);

        p3.add(text3);
        add(p1);
        add(p2);
        add(p3);
    }

    void addActionEvents()
    {
        Bconcat.addActionListener(this);
        Breverse.addActionListener(this);
    }



    public static void main(String[] args) {
        Swing_Strings obj = new Swing_Strings();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Bconcat)
           {
             text3.setText(text1.getText()+text2.getText());

           }
        if(e.getSource() == Breverse)
        {
            String first = text1.getText();
           //   StringBuilder string = new StringBuilder();
           //   string.append(first);
           //   text3.setText(String.valueOf(string.reverse()));

            char ch;
            String rstr ="";
            for(int i=0; i<first.length(); i++)
            {
                ch = first.charAt(i);
                rstr = ch + rstr;
            }
            text3.setText(rstr);
        }

    }

    class MyWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("window is closed...");
        }
    }
}
