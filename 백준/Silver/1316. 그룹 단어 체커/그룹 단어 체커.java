import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (isGroupWord(str)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String str) {
        Set<Character> set = new HashSet<>();
        char prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (now != prev) {
                if (set.contains(now)) {
                    return false;
                }
                set.add(now);
            }
            prev = now;
        }

        return true;
    }
}
