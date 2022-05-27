package layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Text {
    JFrame frame;

    public FlowLayout_Text(){
        frame = new JFrame("FlowLayout");
        frame.setLayout(new FlowLayout());

        // creating buttons

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);


    }

    public static void main(String[] args) {
        new FlowLayout_Text();
    }
}
