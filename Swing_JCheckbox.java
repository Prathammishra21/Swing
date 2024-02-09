import javax.swing.*;
public class Swing_JCheckbox {
    Swing_JCheckbox(){
        JFrame frame = new JFrame("JCheckbox example");
        JCheckBox checkbox1 = new JCheckBox("Java");
        checkbox1.setBounds(180,140,80,50);
        JCheckBox checkbox2 = new JCheckBox("C++");
        checkbox2.setBounds(180,100,50,50);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_JCheckbox();
    }
}
