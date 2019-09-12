package Chap03;

import java.util.Scanner;

class SeqSearchSenForView {

    static int seqSearch(int[] a, int n, int key) {
        int i;

        a[n] = key; // 番兵を追加

        for (int k = 0; k < a.length; k++)
            System.out.printf("%3d", k);
        System.out.println();

        for (int j = 0; j <= n; j++)
            System.out.print("---");
        System.out.println();

        for (i = 0; a[i] != key; i++) {
            for (int l = 0; l < i; l++)
                System.out.print("   ");
            System.out.print("  *");
            System.out.println();
         
            for (int e : a)
                System.out.printf("%3d", e);
            System.out.println();
        }
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