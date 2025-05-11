import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[][] arr = new int[n][3];
    for (int i = 0; i < n; i++) {
      arr[i][0] = i;
      arr[i][1] = sc.nextInt();
    }
    
    Arrays.sort(arr, (a, b) -> a[1] - b[1]);
    
    int prev = arr[0][1];
    arr[0][2] = 0;
    for (int i = 1; i < n; i++) {
      if (prev != arr[i][1]) {
        arr[i][2] = arr[i - 1][2] + 1;
      } else {
        arr[i][2] = arr[i - 1][2];
      }
      prev = arr[i][1];
    }
    
    Arrays.sort(arr, (a, b) -> a[0] - b[0]);
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(arr[i][2]).append(" ");
    }
    System.out.println(sb.toString());
  }
}