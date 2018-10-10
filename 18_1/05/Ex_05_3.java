import java.util.*;

public class Ex_05_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("何段? > ");
        int n = scan.nextInt();

        for(int m = 1; m <= n; m++) {

            for(int o = 1; o <= m; o++) {

                System.out.print(" (;'∀') ");
                
            }

            System.out.println();
        }
    }
}