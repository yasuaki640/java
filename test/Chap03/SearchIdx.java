package Chap03;

import java.util.*;

class SearchIdx {
    static int SearchIdx(int[] a, int n, int key, int[] idx) {
        int elCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[elCount] = i;
                elCount++;
            }
        }

        return elCount;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] array = new int[num];
        int[] indexes = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            array[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int searchKey = stdIn.nextInt();

        int elCount = SearchIdx(array, num, searchKey, indexes);

        if (elCount == 0)
            System.out.println("その値は存在しません");
        else
            for (int i = 0; i < elCount; i++)
                System.out.print("x[" + indexes[i] + "], ");
        System.out.println("にその値は存在します。");

    }
}