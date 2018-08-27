public class Sample_10_2 {
    public static void main(String[] args) {
        Body st1 = new Body("Frank", 175.0, 63.5);
        Body st2 = new Body(177.0, 72.0);
        Body st3 = new Body();

        System.out.println("学生 1");
        System.out.println("名前 : " + st1.name);
        System.out.println("身長 : " + st1.height + "cm");
        System.out.println("体重 : " + st1.weight + "kg");

        
        System.out.println("学生 2");
        System.out.println("名前 : " + st2.name);
        System.out.println("身長 : " + st2.height + "cm");
        System.out.println("体重 : " + st2.weight + "kg");

        
        System.out.println("学生 3");
        System.out.println("名前 : " + st3.name);
        System.out.println("身長 : " + st3.height + "cm");
        System.out.println("体重 : " + st3.weight + "kg");
    }
}