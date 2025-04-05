import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] coins = {25, 10, 5, 1};
    
    for (int i = 0; i < t; i++) {
      int c = sc.nextInt();
      int[] arr = new int[4];
      for (int j = 0; j < 4; j++) {
        arr[j] = c / coins[j];
        c %= coins[j];
        System.out.print(arr[j] + " ");
      }
      System.out.println();
    }
  }
}