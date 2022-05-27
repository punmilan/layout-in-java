package layout;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class JList_Text extends JFrame {
    JList<String>jl;


    public JList_Text(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[]week = { "Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        jl = new JList<String>(week);
        jl.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                JOptionPane.showMessageDialog(null,"show");
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });

        add(jl);


        setVisible(true);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        new JList_Text();
    }

}
