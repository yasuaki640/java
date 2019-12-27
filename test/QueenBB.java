class QueenBB {
    static boolean[] flag = new boolean[8]; // 各行に王妃が配置済みか？
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
            pos[i] = j; // 王妃をj行に配置
            if (i == 7)// 前列に配置終了
                print();
            else {
                flag[j] = true;
                set(i + 1);// 次の列に王妃を配置
                flag[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        set(0); // 0列目に王妃を配置
    }

}