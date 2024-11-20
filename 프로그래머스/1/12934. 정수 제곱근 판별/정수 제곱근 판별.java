class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        if (num == (int) num) {
            answer = (long) ((num + 1) * (num + 1));
        } else {
            answer = -1;
        }
        return answer;
    }
}