import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if (N == number) return 1;
        
        // 연산 값 저장 리스트 중복 제거(Set 사용)
        List<Set<Integer>> dp = new ArrayList<>();
        
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }
        // N 이 1개 사용되는 경우
        dp.get(1).add(N);
        
        // N 이 2개 사용되는 경우부터 8개까지
        for (int i = 2; i <= 8; i++) {
            int num = Integer.parseInt(String.valueOf(N).repeat(i));
            dp.get(i).add(num);
            
            // dp[i] 는 dp[j] 와 dp[i - j] 의 조합으로 만들 수 있음
            // ex) dp[4]는 dp[1] + dp[3], dp[2] + dp[2], dp[3] + dp[1]을 조합
            for (int j = 1; j < i; j++) {
                for (int a : dp.get(j)) {
                    for (int b : dp.get(i - j)) {
                        dp.get(i).add(a + b);
                        dp.get(i).add(a - b);
                        dp.get(i).add(a * b);
                        if (b != 0) dp.get(i).add(a / b);
                    }
                }
            }
            
            if (dp.get(i).contains(number)) {
                return i;
            }
        }
        
        return -1;
    }
}
