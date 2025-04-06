import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] sum = new int[n + 1];
    
    sum[0] = 2;
    for (int i = 1; i <= n; i++) {
      sum[i] = sum[i - 1] + (int) Math.pow(2, i - 1);
    }
    System.out.println(sum[n] * sum[n]);
  }
}