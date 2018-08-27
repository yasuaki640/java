public class Ex_07_3 {
    public static void main(String[] args) {
        
        double r = Double.parseDouble(args[0]);
        
        double S = r*r * Math.PI;

        System.out.printf("面積 : %.1f\n", S );
    }
}