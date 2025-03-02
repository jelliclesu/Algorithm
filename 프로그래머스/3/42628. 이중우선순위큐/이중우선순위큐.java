import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for (String s: operations) {
            String[] arr = s.split(" ");
            int num = Integer.parseInt(arr[1]);
            
            if (arr[0].equals("I")) {
                list.add(num);
                Collections.sort(list);
            } else {
                if (list.isEmpty()) continue;
                if (num == 1) {
                    list.removeLast();
                } else {
                    list.remove();
                }
            }
        }
        if (list.isEmpty()) return answer;
        answer[0] = list.getLast();
        answer[1] = list.getFirst();
        return answer;
    }
}