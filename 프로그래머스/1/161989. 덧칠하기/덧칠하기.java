class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0; 
        
        for (int i = 0; i < section.length; i++) {
            if (section[i] > last) {
                answer++;
                last = section[i] + m - 1;
            }
        }
        return answer;
    }
}