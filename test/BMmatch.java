import java.util.Scanner;

class BMmatch {
    static int bmMatch(String txt, String pat) {
        int pt;
        int pp;
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1]; // スキップテーブル

        // スキップテーブルの作成
        for (pt = 0; pt <= Character.MAX_VALUE; pt++)
            skip[pt] = patLen;
        for (pt = 0; pt < patLen - 1; pt++)
            skip[pat.charAt(pt)] = patLen - pt - 1;
        // pt == patLen - 1である
        // 探索
        while (pt < txtLen) {
            pp = patLen - 1; // patの末尾文字に着目
            while (txt.charAt(pt) == pat.charAt(pp)) {
                if (pp == 0)
                    return pt; // 探索成功
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
        }
        return -1; // 探索失敗
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("テキスト：");
        String s1 = stdIn.next(); // テキスト用文字列

        System.out.print("パターン：");
        String s2 = stdIn.next(); // パターン用文字列

        int idx = bmMatch(s1, s2); // 文字列s1からs2を力まかせ法で探索

        if (idx == -1)
            System.out.println("テキスト中にパターンは存在しません");
        else {
            // マッチ文字の直前までの半角での文字数を求める
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "文字目にマッチします");
            System.out.println("テキスト：" + s1);
            System.out.printf(String.format("パターン：%%%ds\n", len), s2);
        }
    }
}