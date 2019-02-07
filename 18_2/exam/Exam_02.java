import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Exam_02
 */
public class Exam_02 extends JFrame {
    public static void main(String[] args) {
        new Exam_02();
    }

    public Exam_02() {
        setSize(300, 100);
        setTitle("Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel = new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    /**
     * MyJPanell extends JPanel
     */
    public class MyJPanel extends JPanel {
        JLabel label1, label2;
        JTextField field1, field2;

        public void paintCompnent(Graphics g) {
            label1 = new JLabel("ラベル1");
            field1 = new JTextField("フィールド1", 15);

            label2 = new JLabel("ラベル2");
            field2 = new JTextField("フィールド2", 20);

            add(label2);
            add(field2);
            add(label1);
            add(field1);
        }
    }
}