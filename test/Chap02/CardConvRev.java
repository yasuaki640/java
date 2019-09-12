package Chap02;

import java.util.*;

class CardConvRev {

    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no, cd, dno, retry; // 変換する奇数、基数、返還後の桁数、もう一度？
        char[] cno = new char[32]; // 変換後の各桁を格納する文字の配列

        System.out.println("10進数を基数変換します。");
        do {
            do {
                System.out.print("変換する非負の整数：");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("何進数に変換しますか？(2-36)：");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "進数では");
            for (int i = dno - 1; i >= 0; i--)
                System.out.print(cno[i]);
            System.out.println("です。");

            System.out.print("もう一回？：(1...はい / 2...いいえ)　：　");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}