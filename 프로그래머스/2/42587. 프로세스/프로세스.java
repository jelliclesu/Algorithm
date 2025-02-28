import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
            pQueue.add(priorities[i]);
        }
        while (!queue.isEmpty()) {
            int[] top = queue.poll();
            if (top[1] == pQueue.peek()) {
                pQueue.poll();
                answer++;
                if (top[0] == location) {
                    return answer;
                }
            } else {
                queue.add(top);
            }

             
        }
        
        return answer;
    }
}