import java.util.*;

public class Main {
    public static int N;
    public static boolean[][] isNotStar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        isNotStar = new boolean[N][N];

        stars(0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(isNotStar[i][j] ? " " : "*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void stars(int x, int y, int size) {
        if (size == 1) return;

        // 중앙 공백
        int len = size / 3;
        for (int i = x + len; i < x + (len * 2); i++) {
            for (int j = y + len; j < y + (len * 2); j++) {
                isNotStar[i][j] = true;
            }
        }

        // 둘레 공백
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                stars(x + (i * len), y + (j * len), len);
            }
        }
    }
}