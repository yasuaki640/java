import java.util.*;
public class Prc_05_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input x > ");
        int x = scan.nextInt();

        int n = 0;
        int sum = 0;
        do {
            sum = sum + n;
            n++;
        } while(sum < x);

        System.out.println("n : " + (n-1));
        System.out.println("1からnまでの和 : " + sum);
    }
}