class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    // 두 수의 최대 공약수
    public int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 2; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    // 두 수의 최소 공배수
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}