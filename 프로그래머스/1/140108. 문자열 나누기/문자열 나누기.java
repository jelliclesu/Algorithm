class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; ) {
            char x = arr[i];
            int countX = 1;
            int countC = 0;
            int j = i + 1;
            for (; j < arr.length; j++) {
                if (x == arr[j]) {
                    countX++;
                } else {
                    countC++;
                }
                if (countC == countX) {
                    answer++;
                    break;
                }
            }
            
            // 마지막 그룹 처리: 그룹이 끝까지 도달했거나 그룹 조건을 만족한 경우
            if (countC != countX && j == arr.length) {
                answer++;
            }
            
            i = (countC == countX) ? j + 1 : arr.length;
        }
        
        return answer;
    }
}
