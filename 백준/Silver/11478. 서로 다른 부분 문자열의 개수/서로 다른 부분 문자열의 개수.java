import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split("");
    int len = arr.length;
    
    Set<String> set = new HashSet<>();
    String[][] dp = new String[len][len];
    for (int i = 0; i < len; i++) {
      dp[i][i] = arr[i];
      set.add(dp[i][i]);
    }
    
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        dp[i][j] = dp[i][j - 1] + dp[j][j];
        set.add(dp[i][j]);
      }
    }
    System.out.println(set.size());
  }
}