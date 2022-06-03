package jpanel;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class JP_Test {
    JFrame frame;
    JPanel panel;
    JLabel lbl;


    public JP_Test(){
        frame = new JFrame("jpanel with the Border factory :");
        panel = new JPanel();
        frame.setSize(400,400);

        lbl =new JLabel("i am love with u:");
        panel.setBackground(Color.blue);
        panel.add(lbl);
        panel.setBorder(BorderFactory.createTitledBorder("I love u n very much:"));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        new JP_Test();
    }
}
