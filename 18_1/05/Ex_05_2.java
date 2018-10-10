import java.util.*;

public class Ex_05_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("正の整数 > ");
        int number = scan.nextInt();

        int digit = String.valueOf( number ).length();

        System.out.println(digit+ "桁の整数です");
    }
}