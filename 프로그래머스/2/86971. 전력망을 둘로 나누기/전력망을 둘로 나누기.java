import java.util.*;

class Solution {
    static Map<Integer, List<Integer>> map;
    static boolean[] visited;
    static int size;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;        
        
        // 각 송전탑 연결하기
        map = new HashMap<>();
        
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            
            map.putIfAbsent(v1, new ArrayList<>());
            map.get(v1).add(v2);
            
            map.putIfAbsent(v2, new ArrayList<>());
            map.get(v2).add(v1);
        }
        
        // 선 하나씩 잘라보고 차이값 Min 갱신하기
        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            visited[i] = true;

            List<Integer> list = map.get(i);
            
            for (int j = 0; j < list.size(); j++) {
                size = 1;
                int v2 = list.get(j);
                dfs(v2);
                int diff = Math.abs((n - size) - size);
                answer = Math.min(answer, diff);
                System.out.println("v1: " + i + " v2: " + v2 + " size: " + size + " diff: " + diff);
            }
        }
        
        return answer;
    }
    
    private void dfs(int v2) {
        if (visited[v2]) {
            size--;
            return;
        }
        
        visited[v2] = true;

        List<Integer> list = map.get(v2);
        
        for (int i = 0; i < list.size(); i++) {
            int next = list.get(i);
            size++;
            dfs(next);
        }
    }
}