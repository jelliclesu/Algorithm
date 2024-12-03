import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int c1 = 0, c2 = 0, c3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == m1[i % m1.length]) c1++;
            if (answers[i] == m2[i % m2.length]) c2++;
            if (answers[i] == m3[i % m3.length]) c3++;
        }
        
        int max = Math.max(c1, Math.max(c2, c3));
        
        if (max == c1) answer.add(1);
        if (max == c2) answer.add(2);
        if (max == c3) answer.add(3);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}