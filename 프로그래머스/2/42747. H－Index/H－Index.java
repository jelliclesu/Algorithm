import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        int answer = 0;
        
        for (int i = 0; i < len; i++) {
            int h = len - i;
            if (citations[i] >= h) {
                answer = h;
                return answer;
            }
        }
        return answer;
    }
}