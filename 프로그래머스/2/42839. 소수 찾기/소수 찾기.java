import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];

        // 모든 조합 생성
        dfs("", arr, visited);

        // 소수 판별
        for (int n : set) {
            if (isPrime(n)) {
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(String current, char[] arr, boolean[] visited) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + arr[i], arr, visited);
                visited[i] = false;
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
