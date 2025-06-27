import java.util.*;

public class Main {
    public static int N;
    public static boolean[] visited;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N + 1];

        func(1, M);
        System.out.println(sb.toString());
    }

    private static void func(int start, int count) {
        if (count == 0) {
            for (int num : list) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(i);
                func(i + 1, count - 1);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
