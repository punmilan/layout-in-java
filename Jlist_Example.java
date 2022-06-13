package jpanel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Jlist_Example extends JFrame {
    JList<String>jl;

    public Jlist_Example(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[]weeks = {"Sunday","Monday","Tuesday","Wednesday","Friday","Saturday"};
        jl= new JList<>(weeks);

        jl.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JOptionPane.showMessageDialog(null,"You have selected the list" + jl.getSelectedValue());

            }
        });

        add(jl);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Jlist_Example();
    }
}
