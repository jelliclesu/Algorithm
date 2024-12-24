import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 현재 등수 HashMap 으로 저장
        Map<String, Integer> playersMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i); // 플레이어 이름 -> 등수
        }

        for (String calling : callings) {
            int index = playersMap.get(calling); // 현재 등수
            if (index > 0) { // 첫 번째 플레이어가 아니라면
                // 바로 앞 플레이어 이름 찾기
                String frontPlayer = players[index - 1];

                // 등수 교환
                playersMap.put(calling, index - 1);
                playersMap.put(frontPlayer, index);

                // 배열에서도 위치 변경
                players[index] = frontPlayer;
                players[index - 1] = calling;
            }
        }

        return players;
    }
}
