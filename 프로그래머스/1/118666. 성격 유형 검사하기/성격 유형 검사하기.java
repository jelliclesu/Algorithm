import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        // 각 성격 유형의 점수를 저장할 맵
        HashMap<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);
        
        // 점수 계산
        for (int i = 0; i < survey.length; i++) {
            char zero = survey[i].charAt(0); 
            char one = survey[i].charAt(1); 
            int score = Math.abs(choices[i] - 4); 
            
            if (choices[i] < 4) {
                scores.put(zero, scores.get(zero) + score);
            } else if (choices[i] > 4) {
                scores.put(one, scores.get(one) + score);
            }
        }
        // 점수 비교 후 높은 쪽 선택
        answer += (scores.get('R') >= scores.get('T')) ? 'R' : 'T';
        answer += (scores.get('C') >= scores.get('F')) ? 'C' : 'F';
        answer += (scores.get('J') >= scores.get('M')) ? 'J' : 'M';
        answer += (scores.get('A') >= scores.get('N')) ? 'A' : 'N';
        
        return answer;
    }
}
