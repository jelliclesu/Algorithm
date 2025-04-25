import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] nums = Arrays.stream(br.readLine().split(" "))
      .mapToInt(Integer::parseInt)
      .toArray();
    Arrays.sort(nums);

    int max = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 2; i--) {
      for (int j = i - 1; j >= 1; j--) {
        for (int k = j - 1; k >= 0; k--) {
          int sum = nums[i] + nums[j] + nums[k];
          if (m >= sum) {
            max = Math.max(max, sum);
          }
        }
      }
    }
      System.out.println(max);
  }
}