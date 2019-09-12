import java.util.Scanner;

public class Ex1_17 {
    
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i - 1; j--)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print(i);
            for (int l = 1; l <= n - 1; l++)
                System.out.print(" ");

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("何段のピラミッド？：");
        int n = stdIn.nextInt();
        
        npira(n);
    }
}