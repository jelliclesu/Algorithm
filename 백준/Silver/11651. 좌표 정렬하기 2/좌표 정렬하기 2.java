import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] arr = new int[n][2];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr, (a, b) -> {
      if (a[1] == b[1]) return a[0] - b[0];
      return a[1] - b[1];
    });
    
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
  }
}