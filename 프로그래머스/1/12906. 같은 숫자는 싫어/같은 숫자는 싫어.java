import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();

        for (int a : arr) {
            if (answer.isEmpty() ||
               answer.peek() != a) {
                answer.push(a);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}