// program for action listener
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3 extends Frame implements ActionListener {
    public void actionPerformed(ActionEvent e)

    {
        System.out.println("b1 is clicked");
    }
     Frame3()
     {
         setTitle("myframe");
         setSize(400,400);
         setVisible(true);

         Button b1  = new Button("click me");
         b1.addActionListener(this);
         add(b1);


     }



    public static void main(String[] args) {
        Frame3 obj = new Frame3();
    }
}
