import java.util.Scanner;

public class Ex1_15 {

    static void triangleLB(int n) {
        System.out.println("左下直角の二等辺三角形を表示します。");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        System.out.println("左上直角の二等辺三角形を表示します。");
        for (int i = 1; i <= n; i++) {
            for (int j = (n + 1) - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        System.out.println("右上直角の二等辺三角形を表示します。");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = (n + 1) - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        System.out.println("右下直角の二等辺三角形を表示します。");
        for (int i = 1; i <= n; i++) {
            
            for (int j = (n + 1) - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("段数は：");
            n = stdIn.nextInt();
        } while (n <= 0);

        System.out.print("どんな三角形が欲しい？[1:左下 2:左上 3:右上 4:右下]：");
        int shape = stdIn.nextInt();

        switch (shape) {
        case 1:
            triangleLB(n);
            break;

        case 2:
            triangleLU(n);
            break;

        case 3:
            triangleRU(n);
            break;

        case 4:
            triangleRB(n);
            break;
        }
        
        stdIn.close();

    }
}
