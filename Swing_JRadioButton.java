import javax.swing.*;
public class Swing_JRadioButton {
    Swing_JRadioButton(){
     JFrame frame = new JFrame("JRadioButton example");
     JRadioButton jb = new JRadioButton("Male");
     jb.setBounds(140,140,60,60);
     JRadioButton jb1 = new JRadioButton("Female");
     jb1.setBounds(140,180,100,60);
     frame.add(jb);
     frame.add(jb1);
     frame.setSize(400,400);
     frame.setLayout(null);
     frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_JRadioButton();
    }
}
