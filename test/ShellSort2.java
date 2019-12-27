import java.util.Scanner;

class ShellSort2 {
    // 単純挿入ソート
    static void shellSort2(int[] a, int n, int cnt) {
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1)
            ;
        for (; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    cnt++;
                }
                a[j + h] = tmp;
                cnt++;
            }
        }
        System.out.println("要素の交換回数は" + cnt + "です");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("シェルソート");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];
        int cnt = 0;

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        shellSort2(x, nx, cnt); // 挿入ソート

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
