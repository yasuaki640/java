import java.util.* ;

public class Ex_03_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("int1 > ");
        int a = scan.nextInt();

        System.out.print("int2 > ");
        int b = scan.nextInt();

        int diff = Math.abs(a - b);

        System.out.println("two diff is " + diff);
    }
}