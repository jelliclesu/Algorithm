import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fac(N));
    }

    private static int fac(int n) {
        if (n <= 1) return 1;
        return n * fac(n - 1);
    }
}