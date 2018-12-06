import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample_07_2 extends JFrame {
    public static void main(String[] args) {
        new Sample_07_2();
    }

    public Sample_07_2() {
        setSize(800, 500);
        setTitle("Software Development II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel = new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    public class MyJPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
        Dimension dimOfPanel;
        ImageIcon iconMe;
        Timer timer;
        Image imgMe;

        int myWidth, myHeight;
        int myX;
        int myMissileX, myMissileY;
        boolean isMyMissileActive;

        public MyJPanel() {
            setBackground(Color.black);
            addMouseListener(this);
            addMouseMotionListener(this);
            timer = new Timer(50, this);
            timer.start();

            iconMe = new ImageIcon("jiki.jpg");
            imgMe = iconMe.getImage();
            myWidth = imgMe.getWidth(this);
            myHeight = imgMe.getHeight(this);

            myX = 400;
            isMyMissileActive = false;
        }      

        public void paintComponent(Graphics g) {
            dimOfPanel = getSize();
            super.paintComponent(g);

            if (myX+myWidth > dimOfPanel.width) {
                myX = dimOfPanel.width - myWidth;
            }
            g.drawImage(imgMe, myX, 400, this);

            if (isMyMissileActive) {
                g.setColor(Color.white);
                g.fillRect(myMissileX, myMissileY, 2, 5);
                myMissileY -= 25;

                if (myMissileY < 0) isMyMissileActive = false;
            }
            
        }

        public void actionPerformed(ActionEvent e) {
            repaint();
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            if (!isMyMissileActive){
                myMissileX = myX + myWidth/2;
                myMissileY = 400;
                isMyMissileActive = true;
            }
            
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
            myX = e.getX();
        }

        public void mouseDragged(MouseEvent e) {

        }
    }
}
