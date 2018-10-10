import java.util.*;

public class Ex_03_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("month? > ");
        int month = scan.nextInt();

        switch(month) {
            case 2:
                System.out.println(month + " has 28 days");
                break;

            case 4: 
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 30 days");
                break;
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days");
                break;
        }
        
    }
}