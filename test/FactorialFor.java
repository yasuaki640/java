import java.util.*;

class FactorialFor {
    // 皮膚の整数値nの階乗値を返却
    static int factorial(int n) {
        int nFactorial = 1;
        for (int i = n; i > 0; i--) {
            nFactorial *= i;
        }

        return nFactorial;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力せよ：");
        int x = stdIn.nextInt();

        System.out.println(x + "の階乗は" + factorial(x) + "です。");
    }
}
