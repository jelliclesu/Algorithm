import java.util.*;

class Solution {
    static String target;
    static String[] words;
    
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.stream(words).anyMatch(target::equals)) return 0;
        this.target = target;
        this.words = words;
        
        int answer = bfs(begin, 0);
        return answer;
    }
    
    private static int bfs(String begin, int n) {
        Queue<Object[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new Object[] {begin, n});
        visited.add(begin);
        while (!queue.isEmpty()) {
            Object[] arr = queue.poll();
            String word = String.valueOf(arr[0]);
            int count = (int) arr[1];
            
            if (word.equals(target)) {
                return count;
            }
            
            for (String w : words) {
                if (!visited.contains(w) && isOneDiff(w, word)) {
                    queue.add(new Object[] {w, count + 1});
                    visited.add(w);
                }
            }
        }
        return 0;
    }
    
    private static boolean isOneDiff(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) return false;
            }
        }
        return diffCount == 1;
    }
}