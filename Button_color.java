package jpanel;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Button_color {
    JFrame frame;
    JPanel panel;
    JButton b1,b2,b3,b4;


    public Button_color(){
        frame = new JFrame("Change of the Button colors: ");
        panel = new JPanel(new GridLayout(2,2));
        panel.setBorder(BorderFactory.createTitledBorder("Button color change:"));
        frame.setSize(400,400);
        panel.setBackground(Color.cyan);

        b1 = new JButton("1");
        b1.setBackground(Color.red);
        b2 = new JButton("2");
        b2.setBackground(Color.green);
        b3 = new JButton("3");
        b3.setBackground(Color.yellow);
        b4 = new JButton("4");
        b4.setBackground(Color.blue);


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
        new Button_color();
    }
}
