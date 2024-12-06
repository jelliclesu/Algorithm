class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char c : s.toCharArray()) {
            int count = 0; // 각 문자에 대해 새로 시작
            char goal = c;

            while (count < index) {
                goal++; // 다음 문자로 이동
                if (goal > 'z') { // 'z'를 넘어가면 'a'로 순환
                    goal = 'a';
                }
                if (skip.indexOf(goal) == -1) { // skip에 포함되지 않는 경우
                    count++;
                }
            }
            answer += goal;
        }
        return answer;
    }
}
