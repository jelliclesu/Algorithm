import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        LinkedList<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            int[] arr = {i, priorities[i]};
            q.add(arr);
            pq.add(priorities[i]);
        }
        
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            
            if (arr[1]!= pq.peek()) {
                q.add(arr);
            } else {
                pq.poll();
                answer++;
                if (location == arr[0]) break;
            }
        }
        return answer;
    }
}