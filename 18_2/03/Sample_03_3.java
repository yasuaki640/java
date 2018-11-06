import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample_03_3 extends JFrame {
    public static void main(String[] args) {
        new Sample_03_3();
    }

    public Sample_03_3() {
        setSize(300, 200);
        setTitle("Software Development II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel= new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    public class MyJPanel extends JPanel {
        JButton button1, button2, button3;

        public MyJPanel() {
            button1 = new JButton("�{�^��1");

            button2 = new JButton("�{�^��2");
            button2.setForeground(Color.white);
            button2.setBackground(Color.blue);

            button3 = new JButton("�{�^��3");
            button3.setFont(new Font("MS �S�V�b�N", Font.PLAIN, 24));

            add(button1);
            add(button2);
            add(button3);
        }
    }
}
