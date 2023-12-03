// program for combobox..

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceClass extends Frame  {
    ChoiceClass() {
        Choice ch = new Choice();
        Button ok = new Button("ok");
        setTitle("choice");
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());

        ch.add("Marathi");
        ch.add("Hindi");
        ch.add("English");
        ch.add("Math");

        add(ch);
        add(ok);

        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String str = ch.getSelectedItem();
                System.out.println("Selected Item is:"+str);
            }
        });

        ch.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Item Changed..");
            }
        });

    }
    public static void main(String[] args) {
        ChoiceClass obj = new ChoiceClass();
    }
}
