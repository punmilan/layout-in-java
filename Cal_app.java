package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal_app extends JFrame implements ActionListener {
    JPanel panel1;
   // JButton btnAdd,BtnSub,btnDivide,btnMultiply;
    JTextField txtfirst;
    Font serifFont = new Font(Font.SERIF,Font.BOLD,23);
    Container c = getContentPane();


    public Cal_app(){
        setTitle("Hello World");
        setLayout(new BorderLayout(20,20));
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.SOUTH);
        c.add(b3,BorderLayout.EAST);
        c.add(b4,BorderLayout.WEST);
        c.add(b5,BorderLayout.CENTER);




        txtfirst = new JTextField();

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout());
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
        JButton btn11 = new JButton("+");
        JButton btn12 = new JButton("-");
        JButton btn13 = new JButton("/");
        JButton btn14 = new JButton("*");
        JButton btn15 = new JButton("=");
        JButton btn16 = new JButton("0");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btn10);
        c.add(btn11);
        c.add(btn12);
        c.add(btn13);
        c.add(btn14);
        c.add(btn15);
        c.add(btn16);

        btn11 = new JButton(" +");
        btn11.setBackground(Color.red);

        btn12 = new JButton(" -");
        btn12.setBackground(Color.blue);

        btn13 = new JButton("*");
        btn13.setBackground(Color.yellow);

        btn14.setBackground(Color.green);

        btn15.setBackground(Color.pink);
        btn16.setBackground(Color.white);

        panel1.add(btn11);;
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn5);
        panel1.add(btn4);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);
        panel1.add(btn10);
        panel1.setFont(serifFont);




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public static void main(String[] args) {
        new Cal_app();
    }
}
