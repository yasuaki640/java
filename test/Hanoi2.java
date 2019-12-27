import java.util.*;

import Chap04.IntStack;

class Hanoi2 {
    // no軸の円盤をx軸からy軸へ移動
    static void move(int no, int x, int y) {
        IntStack xs = new IntStack(100);
        IntStack ys = new IntStack(100);
        IntStack ss = new IntStack(100);
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xs.push(x);
                ys.push(y);
                ss.push(sw);

                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("[%d]を%d軸から%d軸へ移動\n", no, x, y);

            if (sw == 1 && no > 1) {
                xs.push(x);
                ys.push(y);
                ss.push(sw);
                no = no - 1;
                x = 6 - x - y;
                if (++sw == 2)
                    sw = 0;
                continue;
            }
            do {
                if()
            }
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ハノイの搭");
        System.out.print("円盤の枚数：");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 第1軸に積まれたn枚を第3軸に移動

    }
}