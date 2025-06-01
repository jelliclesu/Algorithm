import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                int top = stack.pop();
                sum -= top;
            } else {
                stack.push(n);
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
