import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        PriorityQueue<int[]> pQueue = new PriorityQueue<>(
            (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]
        );

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            pQueue.add(new int[]{start, end});
        }
        
        int time = 0;
        int count = 0;
        while (!pQueue.isEmpty()) {
            int[] arr = pQueue.poll();
            if (time <= arr[0]) {
                time = arr[1];
                count++;
            }
        }
        System.out.println(count);
    }
}