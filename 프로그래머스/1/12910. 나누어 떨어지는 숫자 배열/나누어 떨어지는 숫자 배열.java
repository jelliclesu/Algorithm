import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> num = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                num.add(arr[i]);
            }
        }
        
        if (num.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[num.size()];
            Collections.sort(num);
            for (int i = 0; i < num.size(); i++) {
                answer[i] = num.get(i);
            }
        }
        
        return answer;
    }
}