import java.util.Scanner;

public class Sample_03_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("何月? > ");;
        int month = scan.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月は春です");
                
            case 6:                
            case 7:
            case 8:
                System.out.println(month + "月は夏です");
                    
            case 9:
            case 10:
            case 11:
                System.out.println(month + "月は秋です");
            
            case 12:
            case 1:
            case 2:
                System.out.println(month + "月は冬です");
            
        }
    }
}