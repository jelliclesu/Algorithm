import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        
        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1];
            int k = command[2] - 1;
            
            int[] arr = Arrays.copyOfRange(array, i, j);
            Arrays.sort(arr);
            answer[count] = arr[k];
            count++;
        }
        
        return answer;
    }
}