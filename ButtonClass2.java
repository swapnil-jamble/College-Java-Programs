import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClass2 extends Frame {
    ButtonClass2() {
        setTitle("myframe");
        setSize(300, 300);
        setVisible(true);

        setLayout(new FlowLayout());
        Button b1 = new Button("b1");
        b1.setEnabled(false);
        add(b1);

        Button b4 = new Button("b4");
        add(b4);

        Button b3 = new Button("b3");
        b3.addActionListener(new Mylistener());
        add(b3);

        Button b2 = new Button("b2");
        b2.setEnabled(true);
        b2.setBackground(Color.pink);
        b2.setForeground(Color.GREEN);
      //  b2.setBounds(100, 100, 200, 100);
        add(b2);






    }


    public static void main(String[] args)
    {
        ButtonClass2 obj = new ButtonClass2();
    }

    class Mylistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("clicked...");

        }
    }
}
