import java.util.*;

class Hanoi2 {
    // no軸の円盤をx軸からy軸へ移動
    static void move(int no, int x, int y) {
        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ハノイの搭");
        System.out.print("円盤の枚数：");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 第1軸に積まれたn枚を第3軸に移動

    }
}