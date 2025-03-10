import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int answer = 0;
        int cameraPosition = Integer.MIN_VALUE;

        for (int[] route : routes) {
            if (cameraPosition < route[0]) {
                answer++; 
                cameraPosition = route[1];
            }
        }
        return answer;
    }
}
