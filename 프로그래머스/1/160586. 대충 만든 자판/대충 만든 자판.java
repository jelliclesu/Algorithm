class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int totalPresses = 0;

            for (char c : target.toCharArray()) {
                int minPresses = Integer.MAX_VALUE;

                for (String key : keymap) {
                    int index = key.indexOf(c);
                    if (index != -1) {
                        minPresses = Math.min(minPresses, index + 1);
                    }
                }

                if (minPresses == Integer.MAX_VALUE) {
                    totalPresses = -1; // 문자를 만들 수 없는 경우
                    break;
                }

                totalPresses += minPresses;
            }

            answer[t] = totalPresses;
        }

        return answer;
    }
}
