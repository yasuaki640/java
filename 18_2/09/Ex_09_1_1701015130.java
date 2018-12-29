import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex_09_1_1701015130 extends JFrame {
    final int windowWidth = 800;
    final int windowHeight = 500;

    public static void main(String[] args) {
        new Ex_09_1_1701015130();
    }

    public Ex_09_1_1701015130() {
        Dimension dimOfScreen = Toolkit.getDefaultToolkit().getScreenSize();

        setBounds(dimOfScreen.width / 2 - windowWidth / 2, dimOfScreen.height / 2 - windowHeight / 2, windowWidth,
                windowHeight);
        setResizable(false);
        setTitle("Software Development II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyJPanel panel = new MyJPanel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
    }

    public class MyJPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
        /* 全体�?�設定に関する変数 */
        Dimension dimOfPanel;
        Timer timer;
        ImageIcon iconMe, iconEnemy;
        Image imgMe, imgEnemy;

        /* 自機に関する変数 */
        int myHeight, myWidth;
        int myX, myY, tempMyX;
        int gap = 100;
        int myMissileX, myMissileY;
        boolean isMyMissileActive;

        /* 敵機に関する変数 */
        int numOfEnemy = 12;
        int numOfAlive = numOfEnemy;
        int enemyWidth, enemyHeight;
        int[] enemyX = new int[numOfEnemy];
        int[] enemyY = new int[numOfEnemy];
        int[] enemyMove = new int[numOfEnemy];
        int[] enemyMissileX = new int[numOfEnemy];
        int[] enemyMissileY = new int[numOfEnemy];
        int[] enemyMissileSpeed = new int[numOfEnemy];
        boolean[] isEnemyAlive = new boolean[numOfEnemy];
        boolean[] isEnemyMissileActive = new boolean[numOfEnemy];

        /* コンストラクタ?��ゲー�?開始時の初期化�?*/ 
        public MyJPanel() {
            // 全体�?�設�?
            setBackground(Color.black);
            addMouseListener(this);
            addMouseMotionListener(this);
            timer = new Timer(50, this);
            timer.start();

            // 画像�?�取り込み
            imgMe = getImg("jiki.jpg");
            myWidth = imgMe.getWidth(this);
            myHeight = imgMe.getHeight(this);

            imgEnemy = getImg("teki.jpg");
            enemyWidth = imgEnemy.getWidth(this);
            enemyHeight = imgEnemy.getHeight(this);

            // 自機と敵機�?�初期�?
            initMyPlane();
            initEnemyPlane();
        }

        /* パネル上�?�描画 */
        public void paintComponent(Graphics g) {
            dimOfPanel = getSize();
            super.paintComponent(g);

            // �?要�?の描画
            drawMyPlane(g); // 自�?
            drawMyMissile(g); // 自機�?�ミサイル
            drawEnemyPlane(g); // 敵�?
            drawEnemyMissile(g); // 敵機�?�ミサイル

            // 敵機を全機撃墜した時の終�?処�?
            if (numOfAlive == 0) {
                System.exit(0);
            }
        }

        /* �?定時間ごとの処�??�?ActionListener に対する処�??�?*/ 
        public void actionPerformed(ActionEvent e) {
            repaint();
        }

        /* MouseListener に対する処�? */
        // マウスボタンをクリ�?クする
        public void mouseClicked(MouseEvent e) {
        }

        // マウスボタンを押下す�?
        public void mousePressed(MouseEvent e) {
            if (!isMyMissileActive) {
                myMissileX = tempMyX + myWidth / 2;
                myMissileY = myY;
                isMyMissileActive = true;
            }
        }

        // マウスボタンを離�?
        public void mouseReleased(MouseEvent e) {
        }

        // マウスが�?�域外へ出�?
        public void mouseExited(MouseEvent e) {
        }

        // マウスが�?�域�?に入�?
        public void mouseEntered(MouseEvent e) {
        }

        /* MouseMotionListener に対する処�? */
        // マウスを動かす
        public void mouseMoved(MouseEvent e) {
            myX = e.getX();
        }

        // マウスをドラ�?グする
        public void mouseDragged(MouseEvent e) {
            myX = e.getX();
        }

        /* 画像ファイルから Image クラスへの変換 */
        public Image getImg(String filename) {
            ImageIcon icon = new ImageIcon(filename);
            Image img = icon.getImage();

            return img;
        }

        /* 自機�?�初期�? */
        public void initMyPlane() {
            myX = windowWidth / 2;
            myY = windowHeight - 100;
            tempMyX = windowWidth / 2;
            isMyMissileActive = false;
        }

        /* 敵機�?�初期�? */
        public void initEnemyPlane() {
            for (int i = 0; i < 7; i++) {
                enemyX[i] = 70 * i;
                enemyY[i] = 50;
            }

            for (int i = 7; i < numOfEnemy; i++) {
                enemyX[i] = 70 * (i - 6);
                enemyY[i] = 100;
            }

            for (int i = 0; i < numOfEnemy; i++) {
                isEnemyAlive[i] = true;
                enemyMove[i] = 1;
            }

            for (int i = 0; i < numOfEnemy; i++) {
                isEnemyMissileActive[i] = true;
                enemyMissileX[i] = enemyX[i] + enemyWidth / 2;
                enemyMissileY[i] = enemyY[i];
                enemyMissileSpeed[i] = 10 + (i % 6);
            }
        }

        /* 自機�?�描画 */
        public void drawMyPlane(Graphics g) {
            if (Math.abs(tempMyX - myX) < gap) {
                if (myX < 0) {
                    myX = 0;
                } else if (myX + myWidth > dimOfPanel.width) {
                    myX = dimOfPanel.width - myWidth;
                }
                tempMyX = myX;
                g.drawImage(imgMe, tempMyX, myY, this);
            } else {
                g.drawImage(imgMe, tempMyX, myY, this);
            }
        }

        /* 自機�?�ミサイルの描画 */
        public void drawMyMissile(Graphics g) {
            if (isMyMissileActive) {
                // ミサイルの配置
                myMissileY -= 15;
                g.setColor(Color.white);
                g.fillRect(myMissileX, myMissileY, 2, 5);

                // 自機�?�ミサイルの敵機各機への当たり判�?
                for (int i = 0; i < numOfEnemy; i++) {
                    if (isEnemyAlive[i]) {
                        if ((myMissileX >= enemyX[i]) && (myMissileX <= enemyX[i] + enemyWidth)
                                && (myMissileY >= enemyY[i]) && (myMissileY <= enemyY[i] + enemyHeight)) {
                            isEnemyAlive[i] = false;
                            isMyMissileActive = false;
                            numOfAlive--;
                        }
                    }
                }

                // ミサイルがウィンドウ外に出たとき�?�ミサイルの再�?�期�?
                if (myMissileY < 0)
                    isMyMissileActive = false;
            }
        }

        /* 敵機�?�描画 */
        public void drawEnemyPlane(Graphics g) {
            for (int i = 0; i < numOfEnemy; i++) {
                if (isEnemyAlive[i]) {
                    if (enemyX[i] > dimOfPanel.width - enemyWidth) {
                        enemyMove[i] = -1;
                    } else if (enemyX[i] < 0) {
                        enemyMove[i] = 1;
                    }
                    enemyX[i] += enemyMove[i] * 10;
                    g.drawImage(imgEnemy, enemyX[i], enemyY[i], this);
                }
            }
        }

        /* 敵機�?�ミサイルの描画 */
        public void drawEnemyMissile(Graphics g) {
            for (int i = 0; i < numOfEnemy; i++) {
                // ミサイルの配置
                if (isEnemyMissileActive[i]) {
                    enemyMissileY[i] += enemyMissileSpeed[i];
                    g.setColor(Color.red);
                    g.fillRect(enemyMissileX[i], enemyMissileY[i], 2, 5);
                }

                // 敵機�?�ミサイルの自機への当たり判�?
                if ((enemyMissileX[i] >= tempMyX) && (enemyMissileX[i] <= tempMyX + myWidth)
                        && (enemyMissileY[i] + 5 >= myY) && (enemyMissileY[i] + 5 <= myY + myHeight)) {
                    System.exit(0);
                }

                // ミサイルがウィンドウ外に出たとき�?�ミサイルの再�?�期�?
                if (enemyMissileY[i] > dimOfPanel.height) {
                    if (isEnemyAlive[i]) {
                        enemyMissileX[i] = enemyX[i] + enemyWidth / 2;
                        enemyMissileY[i] = enemyY[i] + enemyHeight;
                    } else {
                        isEnemyMissileActive[i] = false;
                    }
                }
            }
        }
    }
}