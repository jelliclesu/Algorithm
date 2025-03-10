import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        int bridge = 0;
        int answer = 0;
        
        UnionFind uf = new UnionFind(n);
        
        for (int[] cost : costs) {
            int a = cost[0];
            int b = cost[1];
            int c = cost[2];
            if (uf.find(a) != uf.find(b)) {
                answer += c;
                uf.union(a, b);
                bridge++;
            }
            
            if (bridge == n -1) {
                break;
            }
        }
        return answer;
    }
}

class UnionFind {
    private int[] parent;  
    
    // 초기화 (각 노드는 자기 자신을 부모로 가짐)
    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find (경로 압축 적용)
    public int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    // Union (두 집합을 합침)
    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {  // 사이클이 발생하지 않으면 병합
            parent[rootB] = rootA;
        }
    }
}