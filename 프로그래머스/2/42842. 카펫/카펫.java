class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 0;
        int col = 0;
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                row = (yellow / i) + 2;
                col = i;
            }
            if ((row * 2 + col * 2) == brown) {
                col = col + 2;
                break;
            }
        }
        int[] answer = {row, col};
        return answer;
    }
}