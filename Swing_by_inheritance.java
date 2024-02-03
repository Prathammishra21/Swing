
/* Simple example of Swing by inheritance */
import javax.swing.*;

public class Swing_by_inheritance extends JFrame { // inheriting JFrame
    JFrame frame;

    Swing_by_inheritance() {
        JButton button = new JButton("Click");
        button.setBounds(250, 170, 120, 40);
        add(button);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_by_inheritance();
    }
}
