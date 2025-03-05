import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        int start = 1;
        int end = distance;
        int answer = 0;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int remove = 0;
            int prev = 0;
            
            for (int rock : rocks) {
                int dis = rock - prev;
                if (dis < mid) {
                    remove++;
                    if (remove > n) break;
                } else {
                    prev = rock;
                }
            }
            if (distance - prev < mid) {
                remove++;
            }
            
            if (remove > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                answer = mid;   
            }
        }
        return answer;
    }
}