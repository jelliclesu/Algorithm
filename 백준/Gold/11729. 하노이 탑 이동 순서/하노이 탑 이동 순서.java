import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hanoi(N, "1", "2", "3");
        System.out.println(count + "\n" + sb.toString());

    }

    private static void hanoi(int N, String from, String via, String to) {
        count++;
        if (N == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        // 1. N - 1 개 원판을 B 로 옮긴다
        hanoi(N - 1, from, to, via);
        // 2. from -> to
        sb.append(from).append(" ").append(to).append("\n");
        // 3. B 에 있는 N - 1 개의 원판을 C 로 옮긴다.
        hanoi(N - 1, via, from, to);
    }
}
