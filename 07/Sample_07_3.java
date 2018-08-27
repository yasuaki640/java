import java.util.*;
public class Sample_07_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("String? > ");
        String str = scan.next();
        
        int n = str.length();
        for (int i=n-1; i>=0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
        System.out.println();
    }
}