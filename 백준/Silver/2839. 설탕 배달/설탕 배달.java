import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i <= n / 5; i++) {
      for (int j = 0; j <= n / 3; j++) {
        if (5 * i + 3 * j == n) {
          min = Math.min(min, i + j);
        }
      }
    }
    if (min == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(min);
    }
  }
}