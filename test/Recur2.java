import java.util.Scanner;

import Chap04.IntStack;

class Recur2 {
    // 再帰を除去したrecur
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (!s.isEmpty()) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力せよ：");
        int x = stdIn.nextInt();

        recur(x);
    }
}