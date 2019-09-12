package Chap02;

import java.util.*;

public class Ex2_3 {
    static int sumOf(int[] array) {
        int sum = 0;

        for (int e : array)
            sum += e;

        return sum;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("配列の合計値を求めます。");
        System.out.print("要素数は？：");
        int num = stdIn.nextInt();

        int[] array = new int[num];

        System.out.println("各要素の値を入力してください。");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]：");
            array[i] = stdIn.nextInt();
        }

        System.out.println("配列の全要素の合計値は " + sumOf(array)+ " です。");
    }
}