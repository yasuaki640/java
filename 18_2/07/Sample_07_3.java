import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample_07_3 extends JFrame {
    public static void main(String[] args){
        new Sample_07_3();
    }

    public Sample_07_3() {
        setSize(800, 500);
        setTitle("Software Development II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel= new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    public class MyJPanel extends JPanel implements ActionListener{
        Dimension dimOfPanel;
        Timer timer;
        ImageIcon iconEnemy;
        Image imgEnemy;

        int numOfEnemy = 12;
        int numOfAlive = numOfEnemy;
        int enemyWidth, enemyHeight;
        int[] enemyX = new int[numOfEnemy];
        int[] enemyY = new int[numOfEnemy];
        int[] enemyMove = new int[numOfEnemy];
        boolean[] isEnemyAlive = new boolean[numOfEnemy];

        public MyJPanel() {
            setBackground(Color.black);

            iconEnemy = new ImageIcon("teki.jpg");
            imgEnemy = iconEnemy.getImage();
            enemyWidth = imgEnemy.getWidth(this);
            enemyHeight = imgEnemy.getHeight(this);

            for (int i=0; i<7; i++) {
                enemyX[i] = 70*i;
                enemyY[i] = 50;
            }

            for (int i=7; i<numOfEnemy; i++) {
                enemyX[i] = 70*(i-6);
                enemyY[i] = 100;
            }

            for (int i=0; i<numOfEnemy; i++) {
                isEnemyAlive[i] = true;
                enemyMove[i] = 1;
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i=0; i<numOfEnemy; i++) {
                if (isEnemyAlive[i]) {
                    g.drawImage(imgEnemy, enemyX[i], enemyY[i], this);
                }
            }
        }
    }
}
