import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            max = Math.max(max, n);
            if (max == n) {
                index = i;
            }
        }
        System.out.println(max + "\n" + index);
    }
}