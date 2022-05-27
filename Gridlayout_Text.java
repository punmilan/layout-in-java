package layout;

import javax.swing.*;
import java.awt.*;

public class Gridlayout_Text extends JFrame {
    JFrame frame1;

    public Gridlayout_Text() {
        frame1 = new JFrame("Gridlayout examples");
        int row = 3;
        int col = 3;

        frame1.setLayout(new GridLayout(row, col));

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn10 = new JButton("10");

        frame1.add(btn1);
        frame1.add(btn2);
        frame1.add(btn3);
        frame1.add(btn4);
        frame1.add(btn5);
        frame1.add(btn6);
        frame1.add(btn7);
        frame1.add(btn8);
        frame1.add(btn9);
        frame1.add(btn10);



        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Gridlayout_Text();
    }
}
