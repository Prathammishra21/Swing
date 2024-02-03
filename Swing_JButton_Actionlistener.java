import java.awt.event.*;
import javax.swing.*;

class Swing_JButton_Actionlistener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final JTextField textfield = new JTextField();
        textfield.setBounds(50, 60, 150, 30);
        JButton button = new JButton("Click here");
        button.setBounds(50, 100, 95, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText("Hi Pratham");
            }
        });

        frame.add(button);
        frame.add(textfield);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}