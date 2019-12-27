class EightQueen {
    static boolean[] flag_a = new boolean[8]; // 各行に王妃が配置済みか？
    static boolean[] flag_b = new boolean[15];
    static boolean[] flag_c = new boolean[15];
    static int[] pos = new int[8];// 各列の王妃の位置

    // 盤面を出力
    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    // i列目に王妃を配置
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false) {
                pos[i] = j; // 王妃をj行に配置
                if (i == 7)// 前列に配置終了
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0); // 0列目に王妃を配置
    }

}