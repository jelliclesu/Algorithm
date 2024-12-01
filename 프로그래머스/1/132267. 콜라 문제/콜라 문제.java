class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int m = n / a * b;
            answer += m;
            n = m + n % a;
        }  
        return answer;
    }
}