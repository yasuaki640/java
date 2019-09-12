package Chap03;

import java.util.Scanner;

class SeqSearchSenFor {

    static int seqSearch(int[] a, int n, int key) {
        int i;

        a[n] = key; // 番兵を追加
        
        for (i = 0; a[i] != key; i++)
            ;
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("その値は存在しません");
        else
            System.out.println("その値はx[" + idx + "]にあります。");
    }
}