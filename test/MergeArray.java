import java.util.Scanner;

class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void merge(int[] a, int na, int[] b, int nb, int[] c) {
        int pa = 0; //マージ元配列のポインタを定義
        int pb = 0;
        int pc = 0;//マージ先配列のポインタを定義
        
        while (pa<na && pb<nb)//小さいほうを格納
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
            
        while(pa<na) //aに残った要素をコピー
            c[pc++] = a[pa++];
            
        while(pb<nb) //bに残った要素をコピー
            c[pc++] = b[pb++];
            
        
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
