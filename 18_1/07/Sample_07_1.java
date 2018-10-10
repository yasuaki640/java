import java.util.*;
public class Sample_07_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("文字列1? > ");
        String str1 = scan.next();

        System.out.print("文字列2? > ");
        String str2 = scan.next();

        if(str1.equals(str2)) {
            System.out.println("文字列は等しいぜ、、、");
        } else {
            System.out.println("違うじゃないか！！！！！");
        }
    }
}
