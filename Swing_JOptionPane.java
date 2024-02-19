import javax.swing.*;
public class Swing_JOptionPane {
    JFrame f;
    Swing_JOptionPane(){
        f= new JFrame();
        JOptionPane.showMessageDialog(f,"Hello,how are you");
    }
    public static void main(String[]args){
        new Swing_JOptionPane();
    }
}
