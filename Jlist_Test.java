package jpanel;

import javax.swing.*;

public class Jlist_Test extends JFrame {
    JList<String>jl;


    public Jlist_Test(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String []weeks = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        jl = new JList<>(weeks);


        add(jl);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Jlist_Test();
    }
}
