import javax.swing.*;
public class Swing_JTextArea {
    
    Swing_JTextArea(){
JFrame frame = new JFrame();
JTextArea textarea = new JTextArea("Welcome to this world");
textarea.setBounds(10,30,200,200);
frame.add(textarea);
frame.setSize(300,300);
frame.setLayout(null);
frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    new Swing_JTextArea();    
    }
}
