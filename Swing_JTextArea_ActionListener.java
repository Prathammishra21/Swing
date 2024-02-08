import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.*;

public class Swing_JTextArea_ActionListener implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    Swing_JTextArea_ActionListener(){
        JFrame frame = new JFrame();
        l1= new JLabel();
        l1.setBounds(50, 25, 100, 30);
        l2= new JLabel();
        l2.setBounds(160,25 , 100, 30);
        area =new JTextArea();
        area.setBounds(20,75,250,200);
        b= new JButton("Count Words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        frame.add(l1);
        frame.add(l2);
        frame.add(area);
        frame.add(b);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String text= area.getText();
        String words []= text.split("\\s");
        l1.setText("Words:" +words.length);
        l2.setText("Characters:" +text.length());
    }
public static void main(String[] args) {
    new Swing_JTextArea_ActionListener();
}

}
