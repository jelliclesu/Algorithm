import java.util.*;

class Solution {
    static Map<Integer, List<Integer>> map;
    
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
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            
            // 1. v1 <-> v2 간선 제거
            map.get(v1).remove(Integer.valueOf(v2));
            map.get(v2).remove(Integer.valueOf(v1));
            
            // 2. v1 에서 dfs 시작
            int size = dfs(v1, new boolean[n + 1]);
            
            // 3. diff = abs((n - size) - size)
            int diff = Math.abs((n - size) - size);
        
            // 4. min(answer, diff)
            answer = Math.min(answer, diff);
            
            // 5. v1 <-> v2 간선 복구
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        
        return answer;
    }
    
    private int dfs(int v1, boolean[] visited) {
        visited[v1] = true;
        int count = 1;
        
        for (int next : map.get(v1)) {
            if (!visited[next]) {
                count += dfs(next, visited);
            }
        }
        
        return count;
    }
}