import javax.swing.*;
public class Swing__JPasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPasswordField");
       JPanel panel = new JPanel();
        JLabel lb = new JLabel("Id");
        JPasswordField pf = new JPasswordField(20);
 
     panel.add(lb);
     panel.add(pf);
     frame.add(panel);
       
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
