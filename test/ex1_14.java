import java.util.Scanner;

public class ex1_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("正方形を表示します。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}