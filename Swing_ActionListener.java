import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_ActionListener implements ActionListener {
    JTextField tf;

    public static void main(String[] args) {
        Swing_ActionListener listener = new Swing_ActionListener();
        JFrame frame = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton button = new JButton("Click");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(listener);
        frame.add(button);
        frame.add(tf);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        listener.tf = tf;
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to the world");
    }
}
