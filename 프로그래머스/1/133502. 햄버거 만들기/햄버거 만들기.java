import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int ing : ingredient) {
            stack.push(ing);
            
            int size = stack.size();
            if (size >= 4) {
                if (stack.get(size - 1) == 1 && stack.get(size - 2) == 3 &&
                    stack.get(size - 3) == 2 && stack.get(size - 4) == 1) {
                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    
                    answer++;
                }
            }
        }
        
        return answer;
    }
}