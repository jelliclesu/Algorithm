import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] types = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] values = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (types[i] == 0) {
                deque.addLast(values[i]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            deque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.pollLast()).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}