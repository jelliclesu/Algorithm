import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        for (int a : arr) {
            if (answer.isEmpty() || a != answer.peek()) {
                answer.push(a);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}