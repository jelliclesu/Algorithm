import java.util.*;

class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] maps;
    static int n, m;
    
    public int solution(int[][] maps) {
        this.maps = maps;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        bfs(0, 0);
        if (maps[n - 1][m - 1] == 1) {
            maps[n - 1][m - 1] = -1;
        }
        return maps[n - 1][m - 1];
    }
    
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];
                if (nextX < n && nextX > -1 && 
                    nextY < m && nextY > -1) {
                    if (!visited[nextX][nextY] && maps[nextX][nextY] == 1) {
                        visited[nextX][nextY] = true;
                        maps[nextX][nextY] = maps[now[0]][now[1]] + 1;
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }
}