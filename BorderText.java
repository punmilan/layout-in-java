package layout;

import javax.swing.*;
import java.awt.*;

public class BorderText {
    JFrame frame1;
    public BorderText(){
        frame1 = new JFrame();
        frame1.setLayout(new BorderLayout(20,20));

        // creating buttons

        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
         frame1.add(b1,BorderLayout.NORTH);
         frame1.add(b2,BorderLayout.SOUTH);
         frame1.add(b3,BorderLayout.EAST);
         frame1.add(b4,BorderLayout.WEST);
         frame1.add(b5,BorderLayout.CENTER);

         frame1.setVisible(true);
         frame1.setSize(400,400);
         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame1.setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        new BorderText();
    }
}
