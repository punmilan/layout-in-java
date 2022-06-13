package jpanel;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class Calculator {
    JFrame frame;
    JPanel panel;
    JTextField txtf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;


    public Calculator(){
        frame = new JFrame("this is the calculator app:");
        frame.setSize(400,400);
        panel = new JPanel(new GridLayout(3,4));
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createTitledBorder("This is the calculator of mine:"));

        txtf = new JTextField();
        txtf.setBounds(20,20,140,30);


        b1 = new JButton("1");
        b1.setBackground(Color.red);
        b2 = new JButton("2");
        b2.setBackground(Color.cyan);
        b3 = new JButton("3");
        b3.setBackground(Color.green);
        b4 = new JButton("4");
        b4.setBackground(Color.pink);
        b5 = new JButton("5");
        b5.setBackground(Color.black);
        b6 =new JButton("6");
        b6.setBackground(Color.blue);
        b7 = new JButton("7");
        b7.setBackground(Color.darkGray);
        b8 = new JButton("8");
        b8.setBackground(Color.gray);
        b9 = new JButton("9");
        b9.setBackground(Color.lightGray);
        b10 = new JButton("+");
        b10.setBackground(Color.orange);
        b11 = new JButton("-");
        b11.setBackground(Color.magenta);
        b12 = new JButton("=");
        b12.setBackground(Color.yellow);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(txtf);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        new Calculator();
    }
}
