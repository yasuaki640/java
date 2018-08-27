import java.util.*;

public class Ex_05_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int i = 1;

        System.out.printf("どこまでの和を計算しますか? : ");
        int j = scan.nextInt();

        while(i <= j) {
            sum = sum + i;
            i++;
        }

        System.out.println("1から" + j + "までの和 : " + sum);
    }
}