class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n + 1][m + 1];
        for (int[] puddle : puddles) {
            arr[puddle[1]][puddle[0]] = -1;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) {
                    arr[1][1] = 1;
                    continue;
                }
                if (arr[i][j] != -1) {
                    arr[i][j] = (arr[i][j - 1] + arr[i - 1][j]) % 1000000007;
                    if (arr[i][j - 1] == -1 && arr[i - 1][j] == -1){
                        arr[i][j] += 2;
                    } else if (arr[i][j - 1] == -1 || arr[i - 1][j] == -1) {
                        arr[i][j] += 1;
                    }
                }
            }
        }
        return arr[n][m];
    }
}