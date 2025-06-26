import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static boolean[] visited;
    public static ArrayList<Integer> list;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N + 1];
        list = new ArrayList<>();

        func(0);
        System.out.println(sb.toString());

    }
    
    private static void func(int count) {
        if (count == M) {
            for (int num : list) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(i);
                // 다시 선택
                func(count + 1);
                visited[i] = false;
                list.remove(count);
            }
        }
    }
}