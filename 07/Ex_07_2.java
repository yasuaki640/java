import java.util.Scanner;

public class Ex_07_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("string > ");
        String str1 = scan.nextLine();

        String str2 = str1.toUpperCase();
        System.out.println(str2);
    }
}