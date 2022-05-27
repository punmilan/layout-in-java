package layout;

import javax.swing.*;
import java.awt.*;

public class JB_Text extends JFrame {
    Container c = getContentPane();


    //consturctors;

    public JB_Text(){
        setLayout(new BorderLayout(30,40));

        //creating the buttons;

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");


       c.add(b1,BorderLayout.NORTH);
       c.add(b2,BorderLayout.SOUTH);
       c.add(b3,BorderLayout.EAST);
       c.add(b4,BorderLayout.WEST);
       c.add(b5,BorderLayout.CENTER);



        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new JB_Text();
    }

}
