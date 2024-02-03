
/*Swing by Association inside constructor */
import javax.swing.*;

class Swing_in_constructor {
    JFrame frame;

    Swing_in_constructor() {
        frame = new JFrame();// creating instance of frame
        JButton button = new JButton("Click");// creating instance of button
        button.setBounds(150, 125, 100, 40);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_in_constructor();
    }
}