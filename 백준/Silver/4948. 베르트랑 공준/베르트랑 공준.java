import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) return;
            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
            System.out.println(count);
        }
    }
}