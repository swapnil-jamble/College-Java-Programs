import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
public class Frame2 extends Frame{
    Frame2()
    {
       setTitle("myframe");

       setVisible(true);
       setBounds(200,200,300,300);

       setLayout(new FlowLayout());
       TextField t1 = new TextField("enter1");
       add(t1);

        TextField t2= new TextField("enter1");
        add(t2);

        TextField t3 = new TextField("enter1");
        add(t3);
        t3.setText("hiiiiiiii");


    }



    public static void main(String[] args) {
        Frame2 f = new Frame2();
    }

}
