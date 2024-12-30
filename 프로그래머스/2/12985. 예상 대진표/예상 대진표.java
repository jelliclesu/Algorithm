class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            if (a == b) {
                answer = i + 1;
                return answer;
            }
        }
        return answer;
    }
}