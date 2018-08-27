import java.util.*;

public class Ex_09_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nannkai hurunenn? > ");
        int n = scan.nextInt();
        int [] snm = generateSnm(n);
        System.out.println("detame : ");

        for(int i=0; i<snm.length; i++) {
            System.out.printf(" %d", snm[i]);
            if ((i+1)%10 == 0) {
                System.out.println();
            }
        }
    }

    public static int[] generateSnm(int m) {
        Random rand = new Random();
        int[] arr = new int[m];
        for(int j=0; j<arr.length; j++){
            arr[j] = (int)(Math.random()*6) + 1;
        }
        return arr;
    }
}