import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(comb(M, N));
        }
    }

    private static long comb(int m, int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= m--;
            result /= i;
        }
        return result;
    }
}
