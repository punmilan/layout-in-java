package jpanel;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Layoutwithin_Jpanel {
    JFrame frame;
    JPanel panel;
   // JLabel lbl;
    JButton b1,b2,b3,b4;


    public Layoutwithin_Jpanel(){
        frame = new JFrame("my frame with the panel using the layout:");
        panel = new JPanel();
        frame.setSize(400,400);
        panel.setLayout(new GridLayout(2,2));
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createTitledBorder("I love u n"));
      //  lbl = new JLabel("my first frame:");
      //  panel.add(lbl);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Layoutwithin_Jpanel();
    }
}
