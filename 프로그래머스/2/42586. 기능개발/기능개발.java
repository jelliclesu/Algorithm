import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int count = 1;
        int x = (int) Math.ceil((100 - progresses[0]) / (double) speeds[0]);

        for (int i = 1; i < progresses.length; i++) {
            if (progresses[i] + speeds[i] * x >= 100) {
                count++;
                continue;
            }
            answer.add(count);
            count = 1;
            x = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            
        }
        answer.add(count);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}