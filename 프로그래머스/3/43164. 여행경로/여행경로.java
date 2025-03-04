import java.util.*;

class Solution {
    static ArrayList<String> answer = new ArrayList<>();
    static PriorityQueue<String> queue = new PriorityQueue<>();
    static Map<String, PriorityQueue<String>> map = new HashMap<>();
    static String[][] tickets;
    
    public String[] solution(String[][] tickets) {
        for (String[] str : tickets) {
            // 알파벳 순으로 넣기
            map.putIfAbsent(str[0], new PriorityQueue<>());
            map.get(str[0]).add(str[1]);
        }
        dfs("ICN");
        return answer.toArray(new String[0]);
    }
    
    private static void dfs(String depart) {
        while (map.containsKey(depart) && !map.get(depart).isEmpty()) {
            String next = map.get(depart).poll();
            dfs(next);
        }
        answer.add(0, depart);
    }
    
    
}