import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();        
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }
        
        for (int[] e : edge) {
            arr.get(e[0]).add(e[1]);
            arr.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        
        queue.add(1);
        dist[1] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next: arr.get(now)) {
                if (dist[next] == -1) {
                    dist[next] = dist[now] + 1;
                    queue.add(next);
                }
            }  
        }
        
        Arrays.sort(dist);
        int max = dist[n];
        int answer = 0;
        
        for (int i = n; i > 0; i--) {
            if (max != dist[i]) break;
            answer++;
        }
        return answer;
    }
}