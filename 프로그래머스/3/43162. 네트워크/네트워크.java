class Solution {
    static int n;
    static int[][] computers;
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        return answer;
    }
    
    private static void dfs(int i) {
        visited[i] = true;
        for (int j = 0; j < n; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}