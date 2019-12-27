import java.util.Scanner;

class BinInsertionSort {

    // --- ２分挿入ソート ---//
    static void binInsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int left = 0; // 探索範囲先頭の添字
            int right = i - 1; // 〃 末尾の添字
            int center; // 〃 中央の添字
            int toInsert; // 挿入すべき位置の添字

            do {
                center = (left + right) / 2;
                if (a[center] == key) {// 探索成功
                    break;
                } else if (a[center] < key) {
                    left = center + 1;
                } else {
                    right = center - 1;
                }
            } while (left <= right);
            toInsert = (left <= right) ? center + 1 : right + 1;

            for (int j = i; j > toInsert; j--)
                a[j] = a[j - 1];
            a[toInsert] = key;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("２分挿入ソート");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        binInsertionSort(x, nx); // 配列xを２分挿入ソート

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
