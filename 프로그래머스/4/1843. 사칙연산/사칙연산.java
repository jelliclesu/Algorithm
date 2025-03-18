import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int len = arr.length;
        
        int[] nums = new int[len / 2 + 1];
        String[] op = new String[len / 2];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                nums[i / 2] = Integer.parseInt(arr[i]);
            } else {
                op[i / 2] = arr[i];
            }
        }
        
        int nLen = nums.length;
        int[][] dpMax = new int[nLen][nLen];
        int[][] dpMin = new int[nLen][nLen];
        
        for (int i = 0; i < nLen; i++) {
            dpMax[i][i] = nums[i];
            dpMin[i][i] = nums[i];
        }
        
        for (int gap = 1; gap < nLen; gap++) {
            for (int i = 0; i + gap < nLen; i++) {
                int j = i + gap;    // 끝점
                dpMax[i][j] = Integer.MIN_VALUE;
                dpMin[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    if (op[k].equals("+")) {
                        dpMax[i][j] = Math.max(dpMax[i][j], dpMax[i][k] + dpMax[k + 1][j]);
                        dpMin[i][j] = Math.min(dpMin[i][j], dpMin[i][k] + dpMin[k + 1][j]);
                    } else {
                        dpMax[i][j] = Math.max(dpMax[i][j], dpMax[i][k] - dpMin[k + 1][j]);
                        dpMin[i][j] = Math.min(dpMin[i][j], dpMin[i][k] - dpMax[k + 1][j]);
                    }
                }
            }
        }
        
        
        return dpMax[0][nLen - 1];
    }
}