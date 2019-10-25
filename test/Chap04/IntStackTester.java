package Chap04;

import java.util.Scanner;

class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("現在のデータ数 : " + s.size() + " / " + s.capacity());
            System.out.print("(1)プッシュ　(2)ポップ　(3)ピーク　(4)　" + "(4)ダンプ　(5)終了 : ");

            int menu = stdIn.nextInt();
            if (menu == 0)
                break;
                
            int x;
            switch (menu) {
            case 1:
                System.out.print("データ : ");
                x = stdIn.nextInt();
                try {
                    s.push(x);
                } catch (IntStack.OverflowIntStackException e) {
                    System.out.println("スタックが満杯です。");
                }
                break;
                
            case 2:
                try{
                    x = s.pop();
                    System.out.println("ポップしたデータは" + x + "です。");
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("スタックが空です。");
                }
                break;
            
            case 3:
                try{
                    x = s.peek();
                    System.out.println("ピークしたデータは" + x + "です。");
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("スタックが空です。");
                }
                break;
            
            case 4:
                s.dump();
                break;
            }
        }
    }
}