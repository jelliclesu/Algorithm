import java.util.*;

class Solution {
    public String solution(String X, String Y) {        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char x : X.toCharArray()) {
            countX[x - '0']++;
        }
        for (char y : Y.toCharArray()) {
            countY[y - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(countX[i], countY[i]);
            sb.append(String.valueOf(i).repeat(min));
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.toString().equals("0".repeat(sb.length()))) {
            return "0";
        }
        
        return sb.toString();
    }
}