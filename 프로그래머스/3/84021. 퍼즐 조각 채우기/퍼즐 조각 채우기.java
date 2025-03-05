import java.util.*;

class Solution {
    static int[][] game_board;
    static int[][] table;
    static boolean[][] visitedGame;
    static boolean[][] visitedTable;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n;

    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        this.game_board = game_board;
        this.table = table;
        n = game_board.length;
        
        visitedGame = new boolean[n][n];
        visitedTable = new boolean[n][n];
        
        List<List<int[]>> emptySpace = new ArrayList<>();
        List<List<int[]>> puzzles = new ArrayList<>();
        
        // 빈 공간 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (game_board[i][j] == 0 && !visitedGame[i][j]) {
                    List<int[]> space = new ArrayList<>();
                    spaceDfs(i, j, space);
                    emptySpace.add(space);
                }
            }
        }
        
        // 퍼즐 조각 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (table[i][j] == 1 && !visitedTable[i][j]) {
                    List<int[]> puzzle = new ArrayList<>();
                    puzzleDfs(i, j, puzzle);
                    puzzles.add(puzzle);
                }
            }
        }
        
        // 빈 공간과 일치하는 퍼즐 찾기
        for (int i = 0; i < emptySpace.size(); i++) {
            int[][] spaceArr = toArray(emptySpace.get(i));
            for (int j = 0; j < puzzles.size(); j++) {
                List<int[]> puzzle = puzzles.get(j);
                int[][] puzzleArr = toArray(puzzle);
                if (Arrays.deepEquals(spaceArr, puzzleArr) || 
                    Arrays.deepEquals(spaceArr, rotate90(puzzleArr)) ||
                    Arrays.deepEquals(spaceArr, rotate180(puzzleArr)) || 
                    Arrays.deepEquals(spaceArr, rotate270(puzzleArr))) {
                        answer += puzzle.size();
                        puzzles.remove(j);
                        break;
                }
            }
        }
        
        return answer;
    }
    
    // 빈 공간 찾기
    private void spaceDfs(int i, int j, List<int[]> space) {
        visitedGame[i][j] = true;
        space.add(new int[]{i, j});
        
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && x < n && y >= 0 && y < n) {
                if (game_board[x][y] == 0 && !visitedGame[x][y]) {
                    spaceDfs(x, y, space);
                }
            }
        }
    }
    
    // 퍼즐 조각 찾기
    private void puzzleDfs(int i, int j, List<int[]> puzzle) {
        visitedTable[i][j] = true;
        puzzle.add(new int[]{i, j});
        
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && x < n && y >= 0 && y < n) {
                if (table[x][y] == 1 && !visitedTable[x][y]) {
                    puzzleDfs(x, y, puzzle);
                }
            }
        }
    }
    
    private int[][] toArray(List<int[]> list) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int[] l : list) {
            minX = Math.min(minX, l[0]);
            minY = Math.min(minY, l[1]);
            maxX = Math.max(maxX, l[0]);
            maxY = Math.max(maxY, l[1]);
        }

        int height = maxX - minX + 1;
        int width = maxY - minY + 1;
        int[][] arr = new int[height][width];

        for (int[] l : list) {
            int x = l[0] - minX; // 최소 x를 0으로 정규화
            int y = l[1] - minY; // 최소 y를 0으로 정규화
            arr[x][y] = 1;
        }
        return arr;
    }

    
    private int[][] rotate90(int[][] puzzle2D) {
        int height = puzzle2D.length;
        int width = puzzle2D[0].length;
        int[][] rotate = new int[width][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rotate[j][height - 1 - i] = puzzle2D[i][j];
            }
        }
        return rotate;
    }

    
    private int[][] rotate180(int[][] puzzle2D) {
        return rotate90(rotate90(puzzle2D));
    }
    
    private int[][] rotate270(int[][] puzzle2D) {
        return rotate90(rotate180(puzzle2D));
    }
}
