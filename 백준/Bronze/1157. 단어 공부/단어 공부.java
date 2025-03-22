import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : arr) {
            char upC = Character.toUpperCase(c);
            map.put(upC, map.getOrDefault(upC, 0) + 1);
        }
        
        int max = -1;
        char result = '?';
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            } else if (entry.getValue() == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}