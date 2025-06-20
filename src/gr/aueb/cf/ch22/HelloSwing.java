package gr.aueb.cf.ch22;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("First Swing App");
        jFrame.setSize(600,300);
        jFrame.setLocationRelativeTo(null); // center
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // όταν πατάμε x να κλείνει η εφαρμογή
        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);
        contentPane.add(new JLabel("Hello World"));
        jFrame.setVisible(true);

    }
}
