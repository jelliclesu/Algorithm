import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        for (long j = Math.min(a, b); j > 0; j--) {
            if (a % j == 0 && b % j == 0) {
                System.out.println(j * (a / j) * (b / j));
                break;
            }
        }
    }
}