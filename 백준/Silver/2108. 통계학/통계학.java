import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double sum = 0;
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getValue() == b.getValue()) {
                        return a.getKey() - b.getKey();
                    } return b.getValue() - a.getValue();
                }
        );

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
            arr[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(arr);
        priorityQueue.addAll(map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        // 1. 산술평균 sum / N
        int avg = (int) Math.round(sum / N);
        sb.append(avg).append("\n");
        // 2. 중앙값 arr[N / 2]
        int mid = arr[N / 2];
        sb.append(mid).append("\n");
        // 3. 최빈값 map 을 value 기준 정렬
        Map.Entry<Integer, Integer> first = priorityQueue.poll();
        int mode = first.getKey();
        if (priorityQueue.size() != 0) {
            Map.Entry<Integer, Integer> second = priorityQueue.poll();
            if (first.getValue() == second.getValue()) {
                mode = second.getKey();
            }
        }
        sb.append(mode).append("\n");
        // 4. 최댓값 arr[N - 1] - arr[0]
        int range = arr[N - 1] - arr[0];
        sb.append(range);
        
        System.out.println(sb.toString());
    }
}