import java.util.List;
import java.util.Scanner;

import Chap04.IntStack;

class QuickSort2 {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);
        IntStack rstack = new IntStack(right - left + 1);
        
        lstack.push(left);
        rstack.push(right);
        
        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop(); //左カーソル
            int pr = right = rstack.pop(); //右カーソル
            int x = a[(left + right) / 2]; //枢軸は中央の要素
            
            // 配列を枢軸で分割
            do {
                while (a[pl] < x)
                    pl++;
                while (a[pr] > x)
                    pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);

            } while (pl <= pr);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("クイックソート");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];
        int cnt = 0;

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1);

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
