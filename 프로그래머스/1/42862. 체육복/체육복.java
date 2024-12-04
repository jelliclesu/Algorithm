import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;  // 도난 당했지만, 여벌이 있는 사람의 수
        
        // 배열 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌이 있지만 도난당한 학생
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    count++;
                    reserve[i] = -1; // 이미 사용한 여벌 처리
                    lost[j] = -1;    // 이미 처리한 도난 학생
                    break;           // 해당 reserve[i]는 더 이상 사용하지 않음
                }
            }
        }
        
        // 인접한 학생에게 체육복 빌려주기
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] != -1 && lost[j] != -1 && 
                    (reserve[i] == lost[j] - 1 || reserve[i] == lost[j] + 1)) {
                    count++;
                    reserve[i] = -1; // 여벌 사용 처리
                    lost[j] = -1;    // 도난 해결
                    break;
                }
            }
        }
        answer = n - lost.length + count;
        
        return answer;
    }
}