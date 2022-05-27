package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCombobox_Text extends JFrame {
    JComboBox<String>cmbWeek;

    //constructor;

    public JCombobox_Text(){
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[]week = { "Sunday", "Monday","Tuesday","Wednesday","Thursday"};
                cmbWeek = new JComboBox<String>(week);

                add(cmbWeek);
                cmbWeek.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null,"You have selected " + cmbWeek.getActionCommand());
                    }
                });
                setVisible(true);
    }


    public static void main(String[] args) {
        new JCombobox_Text();
    }
}
