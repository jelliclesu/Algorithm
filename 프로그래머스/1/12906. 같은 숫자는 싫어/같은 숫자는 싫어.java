import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        answer.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (answer.peek() != arr[i]) {
                answer.push(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}