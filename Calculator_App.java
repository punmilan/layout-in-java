package layout;

import javax.swing.*;
import java.awt.*;

public class Calculator_App {
    JFrame framefirst;
    JPanel panel;

    public Calculator_App() {
        framefirst = new JFrame();
        framefirst.setLayout(new BorderLayout());
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");


        framefirst.add(b1, BorderLayout.NORTH);
        framefirst.add(b2, BorderLayout.SOUTH);
        framefirst.add(b3, BorderLayout.EAST);
        framefirst.add(b4, BorderLayout.WEST);
        framefirst.add(b5, BorderLayout.CENTER);



        panel = new JPanel();
        int row = 4;
        int col = 4;
        panel.setLayout(new GridLayout());
        JButton btn1 = new JButton("0");
        JButton btn2 = new JButton("1");
        JButton btn3 = new JButton("2");
        JButton btn4 = new JButton("3");
        JButton btn5 = new JButton("4");
        JButton btn6 = new JButton("5");
        JButton btn7 = new JButton("6");
        JButton btn8 = new JButton("7");
        JButton btn9 = new JButton("8");
        JButton btn10 = new JButton("9");
        JButton btn11 = new JButton("+");
        JButton btn12 = new JButton("-");
        JButton btn13 = new JButton("*");
        JButton btn14 = new JButton("/");
        JButton btn15 = new JButton("=");



        framefirst.setSize(400, 400);
        framefirst.setLocationRelativeTo(null);
        framefirst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framefirst.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator_App();
    }
}
