import javax.swing.*;

public class Swing_JButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click");
        button.setBounds(200, 150, 125, 50);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
}
