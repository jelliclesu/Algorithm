import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<int[]> list = new ArrayList<>();
        
        // yellow 영역 후보 찾기
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int[] arr = {i, yellow / i};
                list.add(arr);
            }
        }
        
        
        // brown 크기에 비교하기
        for (int[] arr : list) {
            if (arr[0] * 2 + arr[1] * 2 + 4 == brown) {
                answer[1] = arr[0] + 2;
                answer[0] = arr[1] + 2;
            }
        }
        return answer;
    }
}