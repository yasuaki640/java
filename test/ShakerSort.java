import java.util.Scanner;

class ShakerSort {
    // 配列の要素a[idx1]とa[idx2]の値を交換
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 単純交換ソート
    static void shakerSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right) {
            for (int i = right; i > left; i--) {
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                    last = i;
                }
            }
            left = last;

            for (int j = left; j < right; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("単純交換ソート(バブルソート)");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        shakerSort(x, nx);

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
