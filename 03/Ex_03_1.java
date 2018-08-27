import java.util.* ;

public class Ex_03_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("A > :");
        int a = scan.nextInt();

        System.out.print("B > :");
        int b = scan.nextInt();

        System.out.print("C > :");
        int c = scan.nextInt();

        if(a<c && a<b){
            System.out.println("min : " + a);
        }

        if(b<a && b<c){
            System.out.println("min : " + b);
        }

        if(c<a && c<b){
            System.out.println("min : " + c);
        }
    }
}