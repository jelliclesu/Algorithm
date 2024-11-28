class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str = "";
        for (int i = 0; i <= t.length() - p.length(); i++) {
            str = t.substring(i, i + p.length());
            if (Long.valueOf(str) <= Long.valueOf(p)) {
                answer++;
            }
        }
        return answer;
    }
}