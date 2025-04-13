import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while (true) {
      int n = sc.nextInt();
      if (n == -1) return;
      
      int sum = 1;
      StringBuilder sb = new StringBuilder();
      sb.append("1");
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          sum += i;
          sb.append(" + ");
          sb.append(i);
        }
      }
      if (sum == n) {
        System.out.println(n + " = " + sb.toString());
      } else {
        System.out.println(n + " is NOT perfect.");
      }
    }
  }
}