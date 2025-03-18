import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] sum = new int[triangle.length][];
        sum[0] = new int[triangle[0].length];
        sum[0][0] = triangle[0][0];
        
        for (int i = 1; i < sum.length; i++) {
            sum[i] = new int[triangle[i].length];
            int len = sum[i].length;
            for (int j = 0; j < len; j++) {
                if (j == 0) {
                    sum[i][j] = sum[i - 1][j] + triangle[i][j];
                } else if (j == len - 1) {
                    sum[i][j] = sum[i - 1][j - 1] + triangle[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i - 1][j - 1], sum[i - 1][j]) + triangle[i][j];
                }
            }
        }
        int max = -1;
        for (int last: sum[sum.length - 1]) {
            max = Math.max(last, max);
        }
        return max;
    }
}