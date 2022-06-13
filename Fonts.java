package jpanel;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Fonts extends JFrame {
    JLabel lbl;

    public Fonts(){
        setSize(400,400);
        lbl = new JLabel("HELLO WORLD THIS IS THE FONTS CHANGE:");
        lbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,14));
        lbl.setForeground(Color.RED);

        setLayout(new GridLayout());
        add(lbl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Fonts();
    }
}
