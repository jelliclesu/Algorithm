import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[elements.length * 2];
        
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }
        int start = 0;
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int j = k; j < arr.length; j++) {
                // s:0 -> j:5, s:1 -> j:6, 
                if (j == elements.length + start) {
                    break;
                }
                sum += arr[j];
                set.add(sum);
            }
            sum =0;
            start++;
        }
        return set.size();
    }
}