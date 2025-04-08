import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            pQueue.add(priorities[i]);
            queue.add(new int[]{i, priorities[i]});
        }
        
        while (!pQueue.isEmpty()) {
            int top = pQueue.peek();
            int[] process = queue.poll();
            if (top > process[1]) {
                queue.add(process);
            } else {
                pQueue.poll();
                answer++;
                if (process[0] == location) return answer;
            }
            
        }
        return answer;
    }
}