import java.util.*;
import java.io.*;

class Solution {
    static String[] arr = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            dfs(arr[i], list); 
        }
        
        Collections.sort(list);
        
        return list.indexOf(word) + 1;
    }
    
    private void dfs(String str, List<String> list) {
        list.add(str);
        
        if (str.length() == 5) return;
        
        for (int i = 0; i < 5; i++) {
            dfs(str + arr[i], list);
        }
    }
}