import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0, zero = 0;
        List<Integer> list = Arrays.stream(win_nums).boxed()
            .collect(Collectors.toList());
        
        for (int num : lottos) {
            if (list.contains(num)) {
                min++;
            } else if (num == 0) {
                zero++;
            }
        }
        int max = min + zero;
        
        int minRank = Math.min(6, 7 - min);
        int maxRank = Math.min(6, 7 - max);
        
        int[] answer = {maxRank, minRank};
        return answer;
    }
}