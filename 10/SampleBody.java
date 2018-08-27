public class SampleBody {
    public static void main(String[] args) {
        Body student = new Body();
        student.name = "Frank";
        student.height = 175.0;
        student.weight = 63.5;
        
        System.out.println("名前 : " + student.name);
        System.out.println("身長 : " + student.height + "cm");
        System.out.println("体重 : " + student.weight + "kg");
    }
}