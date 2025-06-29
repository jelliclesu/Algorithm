import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        func(1, 0);
        System.out.println(sb.toString());
    }

    private static void func(int start, int count) {
        if (count == M) {
            for (int num : list) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            list.add(i);
            func(i, count + 1);
            list.remove(count);
        }
    }
}
