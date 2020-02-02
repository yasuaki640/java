import java.util.Scanner;

class BFmatch {
    // 力まかせ法による文字列探索
    static int bfMatch(String txt, String pat) {
        int pTxt = 0; // txtをなぞるカーソル
        int pPat = 0; // patをなぞるカーソル
        //txtとpatのどちらかをなぞり切ってないかを確認
        while (pTxt != txt.length() && pPat != pat.length()) {
            //文字が一致したら
            if (txt.charAt(pTxt) == pat.charAt(pPat)) {
                //次の確認のためカーソルを動かす
                pTxt++;
                pPat++;
            } else { //一致しなかったら
            //なぞったポインタの文だけパターンを動かす
                pTxt = pTxt - pPat + 1;
                pPat = 0;
            }
        }
        if (pPat == pat.length()) // 探索成功
            return pTxt - pPat;
        return -1; // 探索失敗
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("テキスト：");
        String s1 = stdIn.next(); // テキスト用文字列

        System.out.print("パターン：");
        String s2 = stdIn.next(); // パターン用文字列

        int idx = bfMatchLast(s1, s2); // 文字列s1からs2を力まかせ法で探索

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