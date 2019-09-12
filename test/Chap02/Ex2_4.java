package Chap02;

import java.util.*;

public class Ex2_4 {
    static void copy(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        System.out.print("b[] = {");
        for (int eb : b) {
            System.out.print(eb + ", ");
        }
        System.out.println("}");

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("配列aの要素数は？：");
        int na = stdIn.nextInt();
        int[] a = new int[na];

        System.out.println("各要素の値を入力してください。");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]：");
            a[i] = stdIn.nextInt();
        }

        int[] b = new int[na];

        copy(a, b);

    }

}