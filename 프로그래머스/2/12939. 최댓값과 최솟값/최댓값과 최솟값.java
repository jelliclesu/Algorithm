class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String str : arr) {
            min = Math.min(Integer.valueOf(str), min);
            max = Math.max(Integer.valueOf(str), max);
        }
        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}