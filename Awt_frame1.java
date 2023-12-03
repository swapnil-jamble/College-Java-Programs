// create frame using extend class Frame..
import java.awt.*;

public class Awt_frame1 extends Frame
{
    public static void main(String[] args) {
      Awt_frame1 af = new Awt_frame1();
      af.setVisible(true);
      af.setSize(500,600);
      af.setTitle("MYFrame");
      af.setLocation(500,100);   //set the location on the screen horizontal & vertical
      af.setBackground(Color.pink);



    }
}
