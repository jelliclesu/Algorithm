import java.util.*;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0 ; i < t; i++) {
            long n = sc.nextLong();
            
            if (n <= 1) {
                System.out.println(2);
                continue;
            }

            while (true) {
                boolean isPrime = true;

                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }
}