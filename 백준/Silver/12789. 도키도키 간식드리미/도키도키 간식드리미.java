import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        Stack<Integer> stack = new Stack<>();
        int cur = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (cur == now) {
                cur++;
            } else {
                while (!stack.isEmpty() && stack.peek() == cur) {
                    stack.pop();
                    cur++;
                }
                stack.push(now);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (cur != top) {
                System.out.println("Sad");
                return;
            }
            cur++;
        }

        System.out.println("Nice");
    }
}
