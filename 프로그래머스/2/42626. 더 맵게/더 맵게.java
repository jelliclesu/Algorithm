import java.util.*;

class Solution {
    public long solution(int[] scoville, int K) {
        long answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int s: scoville) {
            pQueue.add(s);
        }
        
        while (pQueue.size() > 1) {
            if (pQueue.peek() >= K) return answer;
            int sc = pQueue.poll() + (pQueue.poll() * 2);
            pQueue.add(sc);
            answer++;
        }
        
        if (!pQueue.isEmpty() && pQueue.peek() < K) {
            answer = -1;
        }
        return answer;
    }
}