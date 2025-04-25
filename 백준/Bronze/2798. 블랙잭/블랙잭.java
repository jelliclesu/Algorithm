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
        
        int re = m - (nums[i] + nums[j]);
        int left = 0, right = j - 1;
        
        int best = -1;
        while (left <= right) {
          int mid = (left + right) / 2;
          if (nums[mid] <= re) {
            best = nums[mid];
            left = mid + 1;
          } else {
            right = mid - 1;
          }
        }
        
        if (best != -1) {
          max = Math.max(max, nums[i] + nums[j] + best);
        }
      }
    }
    System.out.println(max);
  }
}