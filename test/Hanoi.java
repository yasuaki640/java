import java.util.*;

class Hanoi {
    // no軸の円盤をx軸からy軸へ移動
    static void move(int no, int x, int y) {
        String[] axis = { "開始軸", "中間軸", "目的軸" };
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println("円盤[" + no + "]を" + axis[x - 1] + "から" + axis[y - 1] + "へ移動");

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ハノイの搭");
        System.out.print("円盤の枚数：");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 第1軸に積まれたn枚を第3軸に移動

    }
}