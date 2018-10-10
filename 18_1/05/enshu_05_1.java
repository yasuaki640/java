import java.util.*;

public class enshu_05_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("何段? > ");
        int n = scan.nextInt();

        for(int m = 1; m <= n; m++) {

            for(int p = 1; p <= n-m; p++){
                System.out.print("      ");
            }

            for(int o = 1; o <= 2*m - 1; o++) {
                System.out.print("(;'∀')");
            }

            System.out.println();
        }
    }
}