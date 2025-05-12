import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    Set<String> set = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      set.add(st.nextToken());
    }
    
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      if (set.contains(st.nextToken())) {
        sb.append(1).append(" ");
      } else {
        sb.append(0).append(" ");
      }
    }
    System.out.println(sb.toString());
  }
}