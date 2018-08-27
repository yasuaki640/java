import java.util.Random;

public class Sample_09_2 {
    public static void main(String[] args) {
        final int SIZE = 50;
        int[] score = generateScore(SIZE);
        
        System.out.println("点数一覧 : ");
        for (int i=0; i<SIZE; i++) {
            System.out.printf("%4d", score[i]);
            if ((i+1)%10 == 0) {
                System.out.println();
            }
        }
    
    double ave = calcAverage(score);
    System.out.printf("平均点 : %.2f\n", ave);

    int max = maxOfArr(score);
    System.out.println("最高点 : " + max);
    }

    public static int randomScore() {
        Random rand = new Random();
        return (int)(Math.random() * 101);
    }

    public static int[] generateScore(int n) {
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = randomScore();
        }
        return arr;
     }

     public static double calcAverage(int[] arr) {
         int total = 0;
         for(int i=0; i<arr.length; i++) {
             total += arr[i];
         }
         return (double)total /arr.length;
     }

     public static int maxOfArr(int[] arr) {
         int max = arr[0];
         for(int i=1; i<arr.length; i++) {
             if(max < arr[i]) {
                 max = arr[i];
             }
         }
         return max;
     }
}



