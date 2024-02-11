import javax.swing.*;
public class Swing_JTable {
    Swing_JTable() {
        JFrame frame = new JFrame("JTable");
        String column[] = {"ID", "NAME", "SALARY"};
        String data[][] = {
                {"101", "Pratham Mishra", "5000"},
                {"102", "Kartik Tiwari", "20000"},
                {"103", "Arjum Singh", "30000"}
        };

        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
    }

    public static void main(String[] args) {
        new Swing_JTable();
    }
}