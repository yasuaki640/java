import java.util.*;

public class enshu_04_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" 華氏温度 (F) > ");
        double f = scan.nextDouble();

        double c = ( 5*(f-32) ) / 9;
        System.out.print(" 摂氏温度 (C) : ");
        System.out.printf("%.1f\n", c );
        if(c<10) {
            System.out.println(" 寒いです ");
        }else if(c>=10 && c<20){
            System.out.println(" 涼しいです ");
        }else if(c>=20 && c<30) {
            System.out.println(" 暖かいです ");
        }else if(c>30) {
            System.out.println(" 暑いです ");
        }
    }
}