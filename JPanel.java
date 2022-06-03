package jpanel;

import javax.swing.*;
import java.awt.*;

public class JPanel {
    JFrame frame;
    javax.swing.JPanel panel1;
    JLabel lbl1;
    JTextField txtfirst;



    public JPanel(){
        frame = new JFrame("my jpanel");
        panel1= new javax.swing.JPanel();

        frame.setSize(400,400);
        lbl1 = new JLabel("this is the fist jpanel");
        lbl1.setBounds(20,20,150,20);
        txtfirst = new JTextField();
        txtfirst.setBounds(200,20,150,20);
        panel1.setBackground(Color.green);
        panel1.add(lbl1);
        panel1.add(txtfirst);
        frame.add(panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new JPanel();
    }
}
