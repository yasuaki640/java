import java.util.*;

public class Sample_09_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("身長 (cm) > ");
        double h = scan.nextDouble();

        System.out.print("体重 (kg) > ");
        double w = scan.nextDouble();
 
        double sw = calcStdWeight(h);
        System.out.printf("標準体重 : %.1f\n", sw);

        printMessage(w, sw);
    }

    public static double calcStdWeight(double height) {
        height = height / 100.0;
        double stdWeight = height * height * 22.0;
        return stdWeight;
    }    

    public static void printMessage(double weight, double stdWeight) {
        double diff = weight - stdWeight;
        if (diff < -10) {
            System.out.println("Underweight.");
        } else if (diff <= 10) {
            System.out.println("Nomal.");
        } else {
            System.out.println("Overweight");
        }
        
    }
}