import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> truckQ = new LinkedList<>();
        
        for (int t : truck_weights) {
            truckQ.add(t);
        }
        
        int time = 1;
        int first = truckQ.poll();
        queue.add(new int[]{first, time});
        int sum = first;
        
        while (!queue.isEmpty()) {
            time++;
            int[] arr = queue.peek();
            if (time - arr[1] == bridge_length) {
                int[] top = queue.poll();
                sum -= top[0];
            }
            if (queue.size() < bridge_length) {
                if (!truckQ.isEmpty()) {
                    if (truckQ.peek() + sum <= weight) {
                        int next = truckQ.poll();
                        queue.add(new int[]{next, time});
                        sum += next;
                    }
                }
            }
        }
        return time;
    }
}