import javax.swing.*;
public class Swing_JList {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DefaultListModel<String>l1 = new DefaultListModel<>();
        l1.addElement("item 1");
        l1.addElement("item 2");
        l1.addElement("item 3");
        l1.addElement("item 4");
        JList<String>list = new JList<>(l1);
        list.setBounds(100,100,75,75);
        frame.add(list);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
