import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(pq::add);
        
        while (pq.peek() < K) {
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;
            
            if (pq.size() < 2) break;
        }
        
        return pq.peek() < K ? -1 : answer;
    }
}