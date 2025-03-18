class Solution {
    public int solution(int[] money) {
        int n = money.length;
        
        if (n == 1) return money[0];
        
        // 첫 번째 집을 털고 마지막 집은 털지 않는 경우
        int[] dp1 = new int[n];
        dp1[0] = money[0];
        dp1[1] = money[0];  // 첫 번째 집을 털었으므로 두 번째 집은 못 털음

        for (int i = 2; i < n - 1; i++) {  // 마지막 집 제외
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + money[i]);
        }

        // 첫 번째 집을 털지 않고, 마지막 집을 털 수도 있는 경우
        int[] dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = money[1];  // 두 번째 집부터 시작

        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + money[i]);
        }

        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
