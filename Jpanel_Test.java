package jpanel;

import javax.swing.*;
import java.awt.*;

public class Jpanel_Test {
    JFrame frame;
    JPanel Panel;


    public Jpanel_Test(){
        frame = new JFrame("My Jpanel");
        Panel = new JPanel();
        frame.setSize(400,400);
        //frame.add(Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Jpanel_Test();
    }
}
