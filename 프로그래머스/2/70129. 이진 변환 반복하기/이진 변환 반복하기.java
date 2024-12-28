class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;
        
        while (!s.equals("1")) {
            count++;
            int length = s.length();
            s = s.replace("0", "");
            int newLength = s.length();
            
            zero += length - newLength;
            
            // 이진 변환
            s = Integer.toBinaryString(s.length());
        }
        
        int[] answer = {count, zero};
        return answer;
    }
}