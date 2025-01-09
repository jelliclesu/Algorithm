class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1); // 결과 배열의 길이
        int[] answer = new int[length];
        
        for (int idx = 0; idx < length; idx++) {
            long position = left + idx; // 실제 1차원 배열 상의 위치
            int row = (int)(position / n); // 해당 위치의 행
            int col = (int)(position % n); // 해당 위치의 열
            answer[idx] = Math.max(row, col) + 1; // 규칙에 따른 값 계산
        }
        
        return answer;
    }
}
