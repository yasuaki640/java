import java.util.Scanner;

public class Ex_07_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("string > ");
        String str = scan.nextLine();

        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}