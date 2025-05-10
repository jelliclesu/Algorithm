import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    String[][] arr = new String[n][3];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = st.nextToken();
      arr[i][1] = st.nextToken();
      arr[i][2] = String.valueOf(i);
    }
    
    Arrays.sort(arr, (a, b) -> {
      int a1 = Integer.parseInt(a[0]);
      int a2 = Integer.parseInt(b[0]);
      int idx1 = Integer.parseInt(a[2]);
      int idx2 = Integer.parseInt(b[2]);
      if (a1 == a2) return idx1 - idx2;
      return a1 - a2;
    });
    
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
  }
}