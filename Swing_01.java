
/*Simple Java Swing Example */
import javax.swing.*;

public class Swing_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creating instance of JFrame
        JButton button = new JButton("Click"); // creating instance of JButton
        button.setBounds(150, 125, 120, 40);
        frame.add(button); // Adding Button in frame
        frame.setSize(500, 500);//Setting size of frame
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
