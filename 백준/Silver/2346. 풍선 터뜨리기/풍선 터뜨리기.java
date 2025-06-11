import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int now = deque.pollFirst();
        StringBuilder sb = new StringBuilder();
        sb.append(now).append(" ");

        while (!deque.isEmpty()) {
            int w = nums[now - 1];
            if (w > 0) {
                for (int i = 1; i < w; i++) {
                    deque.addLast(deque.pollFirst());
                }
                now = deque.pollFirst();
            } else {
                for (int i = -1; i > w; i--) {
                    deque.addFirst(deque.pollLast());
                }
                now = deque.pollLast();
            }
            sb.append(now).append(" ");
        }
        System.out.println(sb.toString());
    }
}