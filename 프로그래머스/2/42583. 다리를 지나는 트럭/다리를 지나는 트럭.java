import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Integer> trucks = new LinkedList<>();
        LinkedList<Integer> bridge = new LinkedList<>();
        
        trucks = Arrays.stream(truck_weights).boxed().collect(Collectors.toCollection(LinkedList::new));
        
        for (int i = 0; i < bridge_length - 1; i++) {
            bridge.add(0);
        }
        
        int top = trucks.poll();
        int total_weight = top;
        int time = 1;
        
        bridge.add(top);
        
        while (!trucks.isEmpty()) {
            int next = trucks.peek();
            int out = bridge.poll();
            total_weight -= out;
            
            if (total_weight + next > weight) {
                bridge.add(0);
            } else {
                bridge.add(trucks.poll());
                total_weight += next;
            }
            time++;
        }
        time += bridge_length;        
        
        return time;
    }
}