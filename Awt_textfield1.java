import java.awt.TextField;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
public class Awt_textfield1 {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setSize(400,500);
        fr.setVisible(true);

        fr.setLayout(new FlowLayout());       // used for append new textfield bellow of existing textfield
        TextField tf = new TextField("swapnil");
        TextField tf1 = new TextField("jamble");
        Button bt = new Button("click me");

        fr.add(tf);
        fr.add(tf1);
        fr.add(bt);
    }

}
