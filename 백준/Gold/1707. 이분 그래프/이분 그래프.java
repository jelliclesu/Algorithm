import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int[] check;
    static boolean isEven;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < k; i++) {
            String[] str = br.readLine().split(" ");
            int v = Integer.parseInt(str[0]);
            int e = Integer.parseInt(str[1]);
            visited = new boolean[v + 1];
            check = new int[v + 1];
            arr = new ArrayList[v + 1];
            isEven = true;
            for (int p = 1; p <= v; p++) {
                arr[p] = new ArrayList<Integer>();
            }
            for (int j = 0; j < e; j++) {
                str = br.readLine().split(" ");
                int v1 = Integer.parseInt(str[0]);
                int v2 = Integer.parseInt(str[1]);
                arr[v1].add(v2);
                arr[v2].add(v1);
            }
            for (int t = 1; t <= v; t++) {
                if (isEven) {
                    dfs(t);
                } else {
                    break;
                }
            }
            if (isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    private static void dfs(int t) {
        visited[t] = true;
        for (int v : arr[t]) {    // 인접리스트로 받아서 t 에서 연결된 모든 노드 탐색
            if (!visited[v]) {
                check[v] = (check[t] + 1) % 2;
                dfs(v);
            } else if (check[v] == check[t]) {
                isEven = false;
                return;
            }
        }
    }
}