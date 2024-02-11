import javax.swing.*;
public class Swing_JCombobox {
    Swing_JCombobox(){
        JFrame frame = new JFrame("combobox");
        String country [] = {"India","USA","Russia","China"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(100,150,100,20);
        frame.add(cb);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_JCombobox();
    }
}
