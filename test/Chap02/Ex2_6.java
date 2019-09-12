package Chap02;

import java.util.*;

class Ex2_6 {

    static int cardConvR(int no, int cd, char[] cno) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            cno[digits++] = dchar.charAt(no % cd);
            no /= cd;
        } while (no != 0);

        for (int i = 0; i < digits / 2; i++) {
            char tmp = cno[i];
            cno[i] = cno[digits - i - 1];
            cno[digits - i - 1] = tmp;
        }

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
            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("です。");

            System.out.print("もう一回？：(1...はい / 2...いいえ)　：　");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}