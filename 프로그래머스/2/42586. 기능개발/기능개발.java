import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int r = 100 - progresses[i];
            if (r % speeds[i] != 0) {
                queue.add(r / speeds[i] + 1);
            } else {
                queue.add(r / speeds[i]);
            }
        }
        while (!queue.isEmpty()) {
            int top = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && top >= queue.peek()) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}