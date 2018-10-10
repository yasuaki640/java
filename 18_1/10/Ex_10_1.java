import java.util.*;

public class Ex_10_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("x? > ");
        int X = scan.nextInt();

        
        System.out.print("y? > ");
        int Y = scan.nextInt();

        Point xy = new Point(X, Y);

        double DTC = xy.distance(X,Y);
        System.out.printf("Distance is %.2f\n", DTC);
    }
}