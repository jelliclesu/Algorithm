import java.util.*;

public class Main {
    public static int N;
    public static boolean[] visitedCol;
    public static boolean[] visitedDiag1;
    public static boolean[] visitedDiag2;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visitedCol = new boolean[N];
        visitedDiag1 = new boolean[2 * N - 1];
        visitedDiag2 = new boolean[2 * N - 1];
        /*
        N x N 체스판 위에 퀸 N 개를 서로 공격할 수 없게 놓는 문제

        퀸은 상하좌우, 대각선 모든 방향으로 원하는 만큼 이동 가능
        단, 본인의 기물을 뛰어넘을 수 없음

        1. 한 행에 하나씩 (i)
        2. 한 열에 하나씩 (j != i)
        3. 한 대각선에 하나만 존재
            기존에 선택된 (x, y)
            abs(x - i) != abs(y - j)

            대각선은 i + j 가 같던가 i - j 가 같음
            즉, i + j 혹은  i - j 가 true 이면 같은 대각선임
         */
        queen(0);
        System.out.println(count);
    }

    private static void queen(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (!visitedCol[col] && !visitedDiag1[row - col + (N - 1)] && !visitedDiag2[row + col]) {
                visitedCol[col] = true;
                visitedDiag1[row - col + (N - 1)] = true;
                visitedDiag2[row + col] = true;

                queen(row + 1);

                visitedCol[col] = false;
                visitedDiag1[row - col + (N - 1)] = false;
                visitedDiag2[row + col] = false;
            }
        }
    }
}
