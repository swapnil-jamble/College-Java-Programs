import java.awt.Frame;

public class Frame1 extends Frame{

    Frame1(String name)
    {
        super(name);
    }

    public static void main(String args[]) {
        Frame obj = new Frame("Myframe");     // we can directly create frame using frame class
   //     Frame1 obj = new Frame1("Myframe");   // this is called constructor of Frame class
    //    obj.setTitle("title");             // This is inbuilt method used for set title for frame
        obj.setVisible(true);
        obj.setSize(300,333);

        obj.setLocation(500,200);       // set location on the screen

        //    obj.setBounds(500,200,300,333);   //setBounds is combination of 2 methods :setSize & setLocation



    }
}
