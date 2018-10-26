import java.awt.*;
import javax.swing.*;

public class Ex_02_1701015130 extends JFrame {
   public static void main(String[] args){
       new Ex_02_1701015130();
   }

   public Ex_02_1701015130() {
       MyJPanel myJPanel= new MyJPanel();
       Container cont = getContentPane();
       cont.add(myJPanel);

       setSize(1000,1000);
       setTitle("Software Development II");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   }

   public class MyJPanel extends JPanel{
       public MyJPanel(){
           // コンストラクタの記述
       }

        public void paintComponent(Graphics g) {
            g.setColor(Color.orange);//色の変更
            g.fillPolygon(new int[] {150,200,250}, new int[] {200,100,200}, 3);//左耳
            g.fillPolygon(new int[] {750,800,850}, new int[] {200,100,200}, 3);//右耳
            g.fillPolygon(new int[] {150,850,750,500,250}, new int[] {200,200,600,800,600}, 5);//顔
            
            g.setColor(Color.black);//色の変更
            g.fillPolygon(new int[] {250,450,250}, new int[] {300,350,350}, 3);//左眉毛
            g.fillPolygon(new int[] {750,750,550}, new int[] {300,350,350}, 3);//右眉毛
            g.fillOval(300, 400, 100, 100);//左目
            g.fillOval(600, 400, 100, 100);//右目

            g.setColor(Color.red);//色の変更
            g.fillOval(400, 600, 200, 100);

            
       }
   }
}