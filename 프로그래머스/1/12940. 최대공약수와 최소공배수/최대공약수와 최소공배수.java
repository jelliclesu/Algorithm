class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1, 0};
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        for (int i = 2; i <=n; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        
        answer[1] = n * m / answer[0];
        return answer;
    }
}