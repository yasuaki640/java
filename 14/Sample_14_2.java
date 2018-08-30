public class Sample_14_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            System.out.println("プログラムの開始");
            arr[10] = 100;
            System.out.println("値の代入完了");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("! 例外の発生 !");
        }

        System.out.println("プログラムの終了");
    }
}
