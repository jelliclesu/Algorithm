import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int max = 1000000;
        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            
            if (n == 4) {
                System.out.println(1);
                continue;
            }

            int count = 0;
            for (int j = 3; j <= n / 2; j += 2) {
                if (!isNotPrime[j] && !isNotPrime[n - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
