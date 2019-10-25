package Chap03;

import java.util.Arrays;
import java.util.Scanner;

class BinSearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");
        System.out.print("x[0]：");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0)
            System.out.println("その値はx[" + -(idx + 1) + "]の直前に挿入できます。");
        else
            System.out.println("その値はx[" + idx + "]にあります。");
    }
}