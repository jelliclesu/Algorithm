import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 우선순위 큐
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int o1_abs = Math.abs(o1);
            int o2_abs = Math.abs(o2);
            if (o1_abs == o2_abs) {
                return o1 > o2 ? 1 : -1;    // 절댓값이 같은 경우 음수 우선
            }
            return o1_abs - o2_abs;  // 절댓값이 작은 데이터 우선
        });
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                }
                else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(x);
            }
        }
    }
}