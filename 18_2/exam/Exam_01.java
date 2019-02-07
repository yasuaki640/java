import java.awt.*;
import javax.swing.*;

/**
 * Exam_01
 */
public class Exam_01 extends JFrame {
    public static void main(String[] args) {
        new Exam_01();
    }

    public Exam_01() {
        setSize(500, 500);
        setTitle("Sof");
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
        public MyJPanel() {

        }

        public void paintCompnent(Graphics g) {
            g.setColor(new Color(255, 0, 0));
            g.drawLine(215, 255, 225, 300);
            g.drawLine(200, 200, 300, 210);
            g.drawLine(200, 290, 300, 300);
            g.drawLine(245, 200, 255, 300);
            g.drawLine(250, 245, 295, 255);
        }
    }
}