import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++)
            pq.add(sc.nextInt());

        for (int i = 0; i < M; i++) {
            int top = pq.poll();
            pq.add(top / 2);
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += pq.poll();
        }
        System.out.println(sum);
    }
}