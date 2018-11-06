import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample_03_1 extends JFrame {
    public static void main(String[] args) {
        new Sample_03_1();
    }

    public Sample_03_1() {
        setSize(400, 300);
        setTitle("Software Development II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel= new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    public class MyJPanel extends JPanel {
        JLabel label1, label2;

        public MyJPanel() {
            label1 = new JLabel("サイバー大学");
            label1.setForeground(Color.orange);
            label1.setBackground(Color.black);
            label1.setFont(newz);

            label2 = new JLabel();
            label2.setText("IT総合学部");
            label2.setForeground(Color.green);
            label2.setBackground(Color.black);
            label2.setOpaque(true);

            add(label1);
            add(label2);
        }
    }
}
