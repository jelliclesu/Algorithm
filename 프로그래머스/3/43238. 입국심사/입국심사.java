import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for (int t : times) {
            max = Math.max(max, t);
            min = Math.min(min, t);
        }
        long left = min;
        long right = max * n;
        
        while (left < right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }
            if (sum >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}