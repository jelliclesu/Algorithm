import java.util.*;

class Solution {
    static int max;
    static int[][] dungeons;
    static boolean[] visited;
    static int len;

    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;
        visited = new boolean[len];
        max = 0;
        this.dungeons = dungeons;

        dfs(k, 0);

        return max;
    }

    private void dfs(int k, int count) {
        max = Math.max(max, count);

        for (int i = 0; i < len; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], count + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}