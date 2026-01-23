import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            maxW = Math.max(maxW, arr[0]);
            maxH = Math.max(maxH, arr[1]);
        }
        
        return maxW * maxH;
    }
}