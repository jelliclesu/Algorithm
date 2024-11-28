class Solution {
    public String solution(String s) {
        String answer = "";
        char arr[] = s.toCharArray();
        int idx = 0;
        for (char ch : arr) {
            if (ch == ' ') {
                answer += ch;
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    answer += String.valueOf(ch).toUpperCase();
                } else {
                    answer += String.valueOf(ch).toLowerCase();
                }
                idx++;
            }
        }
        return answer;
    }
}