public class Sample_06_2 {
    public static void main(String[] args) {
        int hdc = 5;
        int sjc = 3;

        int[][] score = new int[hdc][sjc];

        for(int i=0; i<hdc; i++) {
            score[i][0] = (i*83 + 15) % 101;
            score[i][1] = (i*79 + 15) % 101;
            score[i][2] = (i*57 + 15) % 101;
        }
        
        for(int i=0; i<sjc; i++) {
            int ttl = 0;
            double avrg = 0;
            System.out.println(i+1 + "人目の学生");

            for(int j=0; j<sjc; j++) {
                ttl += score[i][j];
            }
            System.out.printf("科目A : " + score[i][0] );
            System.out.printf(", 科目B : " + score[i][1] );
            System.out.println(", 科目C : " + score[i][2] );
            System.out.println("合計点 : " + ttl );
            avrg = ttl / sjc;
            System.out.printf("平均点 : %.1f\n",  avrg);
            System.out.println();
        }
        
    }
}