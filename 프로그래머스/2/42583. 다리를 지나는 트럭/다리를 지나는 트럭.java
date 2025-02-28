import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        int bridgeWeight = 0;
        
        for (int t : truck_weights) {
            trucks.add(t);
        }
        
        // 0 을 채워서 다리 길이 지정
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        while (!trucks.isEmpty() || bridgeWeight > 0) {
            answer++;
            
            // 다리 큐에서 젤 앞 트럭이 나갈 차례면 제거
            if (bridge.size() == bridge_length) {
                bridgeWeight -= bridge.poll();
            }
            
            // 새로운 트럭이 다리에 올라갈 수 있는지 확인
            if (!trucks.isEmpty() && bridgeWeight + trucks.peek() <= weight) {
                int truckWeight = trucks.poll();
                bridge.add(truckWeight);
                bridgeWeight += truckWeight;
            } else {
                bridge.add(0); // 트럭이 올라올 수 없으면 0 추가 -> 시간 유지
            }
        }
        return answer;
    }
}