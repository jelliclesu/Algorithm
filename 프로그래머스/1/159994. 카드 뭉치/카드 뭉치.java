import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (Arrays.asList(cards1).contains(goal[i])) {
                if (idx1 == Arrays.asList(cards1).indexOf(goal[i]) 
                    || idx1 + 1 == Arrays.asList(cards1).indexOf(goal[i])) {
                    idx1 = Arrays.asList(cards1).indexOf(goal[i]);
                } else {
                    return "No";
                }
            } else {
                if (idx2 == Arrays.asList(cards2).indexOf(goal[i])
                   || idx2 + 1 == Arrays.asList(cards2).indexOf(goal[i])) {
                    idx2 = Arrays.asList(cards2).indexOf(goal[i]);
                } else {
                    return "No";
                }
            }
        }
        return answer;
    }
}