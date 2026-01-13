import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        Stack<int[]> pre = new Stack<>();
        Stack<int[]> next = new Stack<>();
        
        for (int i = len - 1; i >= 0; i--) {
            int[] arr = {i, prices[i]};
            next.push(arr);
        }
        pre.push(next.pop());
        
        while (!next.isEmpty()) {
            int[] preArr = pre.peek();
            int[] nextArr = next.peek();    
               
            while (!pre.isEmpty() && preArr[1] > nextArr[1]) {
                answer[preArr[0]] = nextArr[0] - preArr[0];
                pre.pop();
                if (!pre.isEmpty()) preArr = pre.peek();
            }
            pre.push(next.pop());      
        }
        
        while (!pre.isEmpty()) {
            int[] preArr = pre.pop();
            answer[preArr[0]] = len - 1 - preArr[0];
        }
        
        return answer;
    }
}