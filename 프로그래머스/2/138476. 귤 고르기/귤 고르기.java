import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // 각 귤 크기별 개수 계산
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        // 개수를 기준으로 내림차순 정렬
        List<Map.Entry<Integer, Integer>> sortedList = map.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .collect(Collectors.toList());
        
        // 필요한 개수만큼 고르기
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            k -= entry.getValue();
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}
