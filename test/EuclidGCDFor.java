import java.util.Scanner;

import javax.sound.midi.Soundbank;

class EuclidGCD {
    // 整数値x, yの最大公約数を求めて返却
    static int gcd(int x, int y) {
        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("二つの整数の最大公約数を求めます。");

        System.out.print("整数を入力せよ：");
        int x = stdIn.nextInt();
        System.out.print("整数を入力せよ：");
        int y = stdIn.nextInt();

        System.out.println("最大公約数は" + gcd(x, y) + "です。");
    }
}