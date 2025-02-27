import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]); // 남은 일수 계산
            queue.add(days);
        }
        
        List<Integer> answer = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }
            
            answer.add(count);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}