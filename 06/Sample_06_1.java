public class Sample_06_1 {
    public static void main(String[] args) {
        final int SIZE = 50;
        int[] score = new int[SIZE];

        for (int i=0; i<SIZE; i++) {
            score[i] = (i*83 + 15) % 101;
        }

        int sum = 0;
        for (int i=0; i<SIZE; i++) {
            sum = sum + score[i];
        }
        double avrg = sum/SIZE;
        System.out.println("平均点 : " + avrg);

        int max = score[0];
        for(int j=0; j<SIZE; j++) {
            if(max < score[j]) {
                max = score[j+1];
            }
        }
        System.out.println("最高点 : " + max);
        
    }
}