import java.util.Scanner;

class Partition {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] a, int n) {
        int L = 0;
        int R = n - 1;
        int x = a[n / 2];// 枢軸

        // 配列を枢軸で分割
        do {
            while (a[L] < x)
                L++;
            while (a[R] > x)
                R--;
            if (L <= R)
                swap(a, L++, R--);

        } while (L <= R);
    }
}