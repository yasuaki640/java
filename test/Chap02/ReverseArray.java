package Chap02;

import java.util.*;

class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("配列の個数は？：");
        int num = stdIn.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10);

        System.out.println("もとの配列");

        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
        for (int j = 0; j < array.length / 2; j++) {
            System.out.println("array[" + j + "]とa[" + (array.length - j - 1) + "]を交換します。");
            swap(array, j, array.length - j - 1);
            for (int element : array)
                System.out.print(element + " ");
            System.out.println();
        }

        System.out.println("斑点が終了した");
        for (int element : array)
            System.out.print(element + " ");

    }

}