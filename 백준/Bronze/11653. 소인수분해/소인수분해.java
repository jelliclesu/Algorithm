import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if (n == 1) return;

    while (n != 0) {
      if (isPrime(n)) {
        System.out.println(n);
        return;
      } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
            System.out.println(i);
            n /= i;
            break;
          }
        }
      }
    }
  }
  private static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}