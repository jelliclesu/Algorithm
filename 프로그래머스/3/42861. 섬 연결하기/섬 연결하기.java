import java.util.*;

class Solution {
  public int solution(int n, int[][] costs) {
    Arrays.sort(costs, (a, b) -> a[2] - b[2]);

    boolean[] visited = new boolean[n];
    visited[costs[0][0]] = true;
    int count = 1;
    int answer = 0;

    while (count < n) {
      for (int[] cost : costs) {
        int from = cost[0];
        int to = cost[1];
        int weight = cost[2];

        if ((visited[from] && !visited[to]) || (!visited[from] && visited[to])) {
          visited[from] = true;
          visited[to] = true;
          answer += weight;
          count++;
          break;
        }
      }
    }

    return answer;
  }
}
