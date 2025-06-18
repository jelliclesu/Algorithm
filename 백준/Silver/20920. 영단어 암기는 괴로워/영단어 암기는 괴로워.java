import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getValue() == b.getValue()) {
                        if (a.getKey().length() == b.getKey().length()) {
                            return a.getKey().compareTo(b.getKey());
                        } return b.getKey().length() - a.getKey().length();
                    } return b.getValue() - a.getValue();
                }
        );

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        priorityQueue.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!priorityQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = priorityQueue.poll();
            sb.append(entry.getKey()).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}
