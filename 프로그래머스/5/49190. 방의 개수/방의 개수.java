import java.util.*;

public class Solution {
    public int solution(int[] arrows) {
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        Map<Node, List<Node>> visited = new HashMap<>();
        Node now = new Node(0, 0);
        int rooms = 0;
        for (int arrow : arrows) {
            for (int i = 0; i < 2; i++) {  // 대각선 이동 시 중간 교차점까지 고려
                Node next = new Node(now.x + dx[arrow], now.y + dy[arrow]);

                if (!visited.containsKey(next)) {
                    visited.put(next, visitedEdges(now));

                    if (visited.get(now) == null) {
                        visited.put(now, visitedEdges(next));
                    } else {
                        visited.get(now).add(next);
                    }
                } 
                
                else if (visited.containsKey(next) && !visited.get(next).contains(now)) {
                    visited.get(next).add(now);
                    visited.get(now).add(next);
                    rooms++;
                }

                now = next;
            }
        }
        return rooms;
    }

    private List<Node> visitedEdges(Node node) {
        List<Node> list = new ArrayList<>();
        list.add(node);
        return list;
    }

    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node node = (Node) obj;
            return this.x == node.x && this.y == node.y;
        }
    }
}
