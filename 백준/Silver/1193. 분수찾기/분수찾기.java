import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    int sum = 1;
    int line = 1;
    while (sum < x) {
      line++;
      sum += line;
    }
    int n = sum - x;
    
    if (line % 2 == 0) {
      System.out.println((line - n) + "/" + (1 + n));
    } else {
      System.out.println((1 + n) + "/" + (line - n));
    }
  }
}