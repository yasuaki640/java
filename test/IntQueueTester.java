import java.util.*;

class IntqueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64); // 最大64個円キューできるキュー

        while (true) {
            System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
            System.out.print("(1)円キュー (2)でキュー　(3)ピーク　(4)ダンプ (0)終了：");
            int menu = stdIn.nextInt();
            if (menu == 0)
                break;

            int x;
            switch (menu) {
            case 1:
                System.out.print("データ：");
                x = stdIn.nextInt();
                try {
                    s.enque(x);
                } catch (IntQueue.OverflowIntQueueException e) {
                    System.out.println("キューが満杯です。");
                }
                break;

            case 2:
                try {
                    x = s.deque();
                    System.out.println("デキューしたデータは" + x + "です。");
                } catch (IntQueue.EmptyIntQueueException e) {
                    System.out.println("キューが空です。");
                }

            case 3:
                try {
                    x = s.peek();
                    System.out.println("ピークしたデータは" + x + "です。");
                } catch (IntQueue.EmptyIntQueueException e) {
                    System.out.println("キューが空です");
                }
                break;

            case 4:
                s.dump();
                break;
            }
        }
    }
}