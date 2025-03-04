import java.util.*;

class Solution {
    static int[] dx = {0, 1, 0, -1}; // 상, 우, 하, 좌
    static int[] dy = {1, 0, -1, 0};
    static int itemX, itemY;
    static int[][] map;

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        this.itemX = itemX * 2;
        this.itemY = itemY * 2;

        map = new int[102][102]; // 2배 확장

        // 내부를 1로 채우고 테두리를 2로 설정
        for (int[] r : rectangle) {
            int x1 = r[0] * 2, y1 = r[1] * 2;
            int x2 = r[2] * 2, y2 = r[3] * 2;

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (map[i][j] == 1) continue; // 이미 설정된 경우 건너뛰기
                    map[i][j] = 1; // 내부 채우기
                    if (i == x1 || i == x2 || j == y1 || j == y2) map[i][j] = 2; // 테두리 설정
                }
            }
        }

        return bfs(characterX * 2, characterY * 2);
    }

    private static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[102][102];
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0], y = arr[1], count = arr[2];

            if (x == itemX && y == itemY) return count / 2;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k], ny = y + dy[k];

                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102) {
                    if (!visited[nx][ny] && map[nx][ny] == 2) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, count + 1});
                    }
                }
            }
        }
        return -1;
    }
}
