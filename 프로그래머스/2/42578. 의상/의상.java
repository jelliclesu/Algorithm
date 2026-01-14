import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (String[] arr : clothes) {
            map.putIfAbsent(arr[1], new ArrayList<>());
            map.get(arr[1]).add(arr[0]);
        }
        
        for (String key : map.keySet()){
            answer *= map.get(key).size() + 1;
        }
        
        return answer - 1;
    }
}