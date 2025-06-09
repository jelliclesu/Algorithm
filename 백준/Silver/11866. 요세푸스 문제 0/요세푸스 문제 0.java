import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                queue.add(queue.poll());
            }
            if (queue.size() == 1) {
                sb.append(queue.poll());
            } else {
                sb.append(queue.poll()).append(", ");
            }
        }
        System.out.println("<" + sb.toString() + ">");
    }
}