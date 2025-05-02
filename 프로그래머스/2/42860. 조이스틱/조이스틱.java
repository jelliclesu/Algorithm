class Solution {
    public int solution(String name) {
        int len = name.length();
        int move = len - 1;
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            // 위아래
            count += Math.min(ch - 'A', 'Z' - ch + 1);

            // 다음 위치부터 연속된 'A'의 개수
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            // 왼오 최소값 구하기
            move = Math.min(move, (i * 2) + len - next);    // 오른쪽으로 가다가 우회
            move = Math.min(move, (len - next) * 2 + i);    // 왼쪽으로 가다가 우회
        }

        return count + move;
    }
}
