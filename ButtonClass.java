import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonClass extends Frame {
    ButtonClass()
    {
        setTitle("mybuttonframe");
        setVisible(true);
        setBounds(300,300,400,400);
        setLayout(new FlowLayout());

        Button b1= new Button("submit");
        add(b1);
        Button b2= new Button();
        b2.setLabel("2nd submit");
        add(b2);
        Button b3= new Button("submit");
        b3.setLabel("3rd button");
        add(b1);

        addWindowListener(new mywindow());
    }

    public static void main(String[] args) {

        ButtonClass b = new ButtonClass();
    }

    class mywindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.out.println("Window is closed");
        }
    }
}
