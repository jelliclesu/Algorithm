import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      for (int j = Math.min(a, b); j > 0; j--) {
        if (a % j == 0 && b % j == 0) {
          System.out.println(j * (a / j) * (b / j));
          break;
        }
      }
    }
  }
}