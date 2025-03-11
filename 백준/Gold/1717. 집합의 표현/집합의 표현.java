import java.util.*;
import java.io.*;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (q == 0) {
                union(a, b);
            } else {
                boolean result = checkSame(a, b);
                if (result) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }
    
    private static int find(int a) {
        if (a == parent[a]) return a;
        else {
            return parent[a] = find(parent[a]);
        }
    }
    
    private static boolean checkSame(int a, int b) {
        return find(a) == find(b);
    }
}