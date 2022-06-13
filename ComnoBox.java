package jpanel;

import javax.swing.*;
import java.awt.*;

public class ComnoBox extends JFrame {
    JComboBox<String>cmdweeks;

    public ComnoBox(){
        setLayout(new GridLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[]week ={"sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        cmdweeks = new JComboBox<String>(week);
        add(cmdweeks);
        setVisible(true);

    }


    public static void main(String[] args) {
        new ComnoBox();
    }
}
