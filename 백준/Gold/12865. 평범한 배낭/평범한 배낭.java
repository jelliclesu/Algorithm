import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        int[][] dp = new int[n + 1][k + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (arr[i - 1][0] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i - 1][0]] + arr[i - 1][1]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}