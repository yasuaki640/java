import java.util.*;

public class Prc_05_1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("何乗すんねん？ > ");
        int i = scan.nextInt();

        int k = 1;

        for(int j = 1; j <= i; j++) {
            k = 2 * k;
            System.out.println(" 2^" + j + " = " + k);
        }
    }
}