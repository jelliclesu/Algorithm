class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isNewWord = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer.append(ch);
                isNewWord = true;
            } else {
                if (isNewWord) {
                    answer.append(Character.toUpperCase(ch));
                    isNewWord = false;
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
            }
        }
        return answer.toString();
    }
}