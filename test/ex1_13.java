public class ex1_13 {
    public static void main(String[] args) {
        System.out.println("--九九の表--");
        
        System.out.print("  |");

        for (int k = 1; k <= 9; k++) {
            System.out.printf("%3d", k);
        }
        System.out.println();

        for (int l = 1; l <= 27; l++) {
            if (l == 3) {
                System.out.print("+");
                continue;
            }
            
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}