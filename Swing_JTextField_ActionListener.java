import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Swing_JTextField_ActionListener implements ActionListener {

    JTextField t1, t2, t3;
    JButton b1, b2;

    Swing_JTextField_ActionListener() {
        JFrame frame = new JFrame("JTextField with Action Listener");
        t1 = new JTextField();
        t1.setBounds(50, 50, 150, 20);
        t2 = new JTextField();
        t2.setBounds(50, 100, 150, 20);
        t3 = new JTextField();
        t3.setBounds(50, 150, 150, 20);
        t3.setEditable(false);
        b1 = new JButton("Add");
        b1.setBounds(50, 200, 80, 60);
        b2 = new JButton("Subtract");
        b2.setBounds(120, 200, 100, 60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(b1);
        frame.add(b2);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        String result = String.valueOf(c);
        t3.setText(result);
    }

    public static void main(String[] args) {
        new Swing_JTextField_ActionListener();
    }
}
