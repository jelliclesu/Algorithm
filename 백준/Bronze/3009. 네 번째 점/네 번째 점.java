import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        
        for (int key : xMap.keySet()) {
            if (xMap.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        
        for (int key: yMap.keySet()) {
            if (yMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}