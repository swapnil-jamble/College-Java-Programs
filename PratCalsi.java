
        import java.awt.*;
import java.awt.event.*;

        public class PratCalsi extends Frame implements ActionListener
        {
            Panel p1 =new Panel();
            Panel p2 = new Panel();
            TextField txt = new TextField(10);

            Button b0 = new Button("0");
            Button b1 = new Button("1");
            Button b2 = new Button("2");
            Button b3 = new Button("3");
            Button b4 = new Button("4");
            Button b5 = new Button("5");
            Button b6 = new Button("6");
            Button b7 = new Button("7");
            Button b8 = new Button("8");
            Button b9 = new Button("9");
            Button bsum = new Button("+");
            Button bsub = new Button("-");
            Button bmul = new Button("*");
            Button bdiv = new Button("/");
            Button bequal = new Button("=");
            Button bclear = new Button("Clr");

            String str = "";



            PratCalsi() {

                setTitle("Calsi");
                setSize(300, 300);
                setVisible(true);
                setLayout(new GridLayout());

                p1.add(txt);
                p2.add(b0);
                p2.add(b1);
                p2.add(b2);
                p2.add(b3);
                p2.add(b4);
                p2.add(b5);
                p2.add(b6);
                p2.add(b7);
                p2.add(b8);
                p2.add(b9);
                p2.add(bsum);
                p2.add(bsub);
                p2.add(bmul);
                p2.add(bdiv);
                p2.add(bequal);
                p2.add(bclear);

                add(p1);
                add(p2);

                b0.addActionListener(this);
          //      b1.addActionListener(this);


            }


            public static void main(String[] args) {
                PratCalsi obj = new PratCalsi();
            }
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b0)
                    str = str + b0.getActionCommand();
                System.out.println(b0.getActionCommand());
            }
   }