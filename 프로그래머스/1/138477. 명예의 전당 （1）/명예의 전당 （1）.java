import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> max = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            max.add(score[i]);
            Collections.sort(max);
            if (i < k) {
                answer[i] = max.get(0);
            } else {
                answer[i] = max.get(i - k + 1);
            }
        }
        return answer;
    }
}