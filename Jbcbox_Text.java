package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jbcbox_Text extends JFrame {
    JComboBox<String>cmbMonths;


    //consturctor;

    public Jbcbox_Text(){
        setLayout(new FlowLayout());
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       String[]Months = { "january","Feb","March","April","May","March","June","July"};
       cmbMonths = new JComboBox<String>(Months);

       add(cmbMonths);
       cmbMonths.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"show message dialog");
           }
       });
       setVisible(true);

    }


    public static void main(String[] args) {
        new Jbcbox_Text();
    }

}
