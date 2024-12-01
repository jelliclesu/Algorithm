import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        int[] box = new int[m];
        Arrays.sort(score);
        
        for (int i = 1; i <= len / m; i++) {
            answer += score[len - i * m] * m;
        }
        return answer;
    }
}