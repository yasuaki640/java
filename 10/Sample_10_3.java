public class Sample_10_3 {
    public static void main(String[] args) {
        Body st1 = new Body("Frank", 175.0, 63.5);
        Body st2 = new Body("Thomas", 177.0, 72.0);

        System.out.println("=== 学生1 ===");
        st1.print();
        double sw = st1.calcStdWeight();
        System.out.println("標準体重 : " + sw + " kg");

        
        System.out.println("=== 学生2 ===");
        st2.print();
        sw = st2.calcStdWeight();
        System.out.println("標準体重 : " + sw + " kg");
    }
}