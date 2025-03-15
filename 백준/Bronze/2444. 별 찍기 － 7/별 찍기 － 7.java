import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= 2 * n - 1; i++) {
            int e = Math.abs(i - n);
            int s = n - e - 1;
            System.out.println(" ".repeat(e) + "*".repeat(s) + "*" + "*".repeat(s));
        }
    }
}