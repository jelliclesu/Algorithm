import java.io.*;
import java.util.*;

public class Main {
    public static int[][] sudoku = new int[9][9];
    public static ArrayList<int[]> list = new ArrayList<>();
    public static boolean solved;
    public static void main(String[] args) throws IOException {
        /*
        스도쿠
        1. 각각의 가로 세로 줄에 1부터 9까지 숫자 한 번씩만
        2. 3x3 정사각형 안에 1부터 9까지 숫자 한 번씩만

        풀이 방법
        1. 빈 칸의 좌표를 리스트에 저장
        2. DFS(idx):
            - idx 에 1 ~ 9 시도
            - 행, 열, 3x3 박스 검사
            - 가능하면 값 넣고 다음 DFS(idx + 1)
            - 실패하면 백트래킹하고 다음 값 시도
        3. 끝까지 다 채워지면 출력
         */

        // 입력 받아서 배열에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 9; i++) {
            sudoku[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }
        dfs(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(sudoku[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int idx) {
        if (idx == list.size()) {
            solved = true;
            return;
        }

        int[] position = list.get(idx);
        int x = position[0];
        int y = position[1];

        for (int i = 1; i <= 9; i++) {
            if (isValid(i, x, y)) {
                sudoku[x][y] = i;
                dfs(idx + 1);
                if (solved) return;
                sudoku[x][y] = 0;   // 백트래킹
            }
        }
    }

    private static boolean isValid(int num, int x, int y) {
        // 행열에 있는지 확인
        for (int j = 0; j < 9; j++) {
            if (sudoku[x][j] == num
                    || sudoku[j][y] == num) {
                return false;
            }
        }

        // 3 x 3 에 있는지 확인
        int startRow = (x / 3) * 3;
        int startCol = (y / 3) * 3;
        for (int j = startRow; j < startRow + 3; j++) {
            for (int k = startCol; k < startCol + 3; k++) {
                if (sudoku[j][k] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
