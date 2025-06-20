package gr.aueb.cf.ch22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        this.setTitle("Hello Coding Factory");
        setSize(400, 200);
        setLocationRelativeTo(null);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(new JLabel("Coding Factory"));

        JButton btn = new JButton();
        contentPane.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // δίνει popups
                JOptionPane.showMessageDialog(null, "Hello CF", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}
