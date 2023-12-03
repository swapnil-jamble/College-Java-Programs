// program for ActionListener for each button
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class Frame4 extends Frame implements ActionListener {
    Button b1,b2;
    Frame4()
    {
        setTitle("myframe");
        setSize(400,400);
        setVisible(true);
         setLayout(new FlowLayout());
         b1  = new Button("click b1");
        b1.addActionListener(this);

        b2 = new Button("Click b2");
        b2.addActionListener(this);

        add(b1);
        add(b2);

        addWindowListener(new MyWindow());


    }



    public static void main(String[] args) {
        Frame4 obj = new Frame4();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            System.out.println("b1 is clicked");
        else if(e.getSource()==b2)
            System.out.println("b2 is clicked");
    }



     class MyWindow extends WindowAdapter {

         public void windowClosing(WindowEvent e2) {
             dispose();
             System.out.println("Window is closed");
         }
     }


}
