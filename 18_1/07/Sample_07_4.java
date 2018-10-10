public class Sample_07_4 {
    public static void main(String[] args) {
        int n = args.length;

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("合計 : " + sum);
    }
}