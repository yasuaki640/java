import java.util.Scanner;

class Partition {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left; // 左カーソル
        int pr = right;// 右カーソル
        int x = a[(pl + pr) / 2];// 枢軸

        // 配列を枢軸で分割
        do {
            while (a[pl] < x)
                pl++;
            while (a[pr] > x)
                pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);

        } while (pl <= pr);

        if (left < pr)
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
    }
    
}