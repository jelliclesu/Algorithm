import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    int sum = 0;
    int min = 0;
    for (int i = m; i <= n; i++) {
      if (i == 1) continue;
      if (isPrime(i)) {
        if (sum == 0) {
          min = i;
        }
        sum += i;
      }
    }
    if (sum != 0) {
      System.out.println(sum + "\n" + min);
    } else {
      System.out.println(-1);
    }
  }

  private static boolean isPrime(int i) {
    for (int j = 2; j <= Math.sqrt(i); j++) {
      if (i % j == 0) return false;
    }
    return true;
  }
}