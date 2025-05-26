import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int now = sc.nextInt();
            list.add(now - prev);
            prev = now;
        }

        int min = Collections.min(list);
        while (true) {
            boolean b = true;
            for (int dis : list) {
                if (dis % min != 0) {
                    min--;
                    b = false;
                    break;
                }
            }
            if (b) break;
        }

        int sum = 0;
        for (int dis : list) {
            sum += dis / min - 1;
        }
        System.out.println(sum);
    }
}