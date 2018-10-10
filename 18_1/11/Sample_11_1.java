public class Sample_11_1 {
    public static void main(String[] args) {
        Point p = new Point(10, 7);
        double d = p.distance();

        System.out.println("=== 点p ===");
        System.out.println("x座標 : " + p.getX());
        System.out.println("y座標 : " + p.getY());
        System.out.printf("原点からの距離 : %.3f\n", d);

        p.setX(5);
        p.setY(12);
        d = p.distance();

        System.out.println("=== 点p ===");
        System.out.println("x座標 : " + p.getX());
        System.out.println("y座標 : " + p.getY());
        System.out.printf("原点からの距離 : %.3f\n", d);
        
    }
}