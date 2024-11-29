import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0] - 1;
            int j = commands[n][1];
            int k = commands[n][2] - 1;
            // array[i] ~ array[j];
            int[] arr = Arrays.copyOfRange(array, i, j);
            
            // sort
            Arrays.sort(arr);
            answer[n] = arr[k];
        }
        return answer;
    }
}