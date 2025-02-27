import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        int count = 1;
        boolean result = true;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a >= count) {
                while (a >= count) {
                    stack.push(count++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int top = stack.pop();
                if (top > a) {
                    System.out.print("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.print(sb.toString());
        }
    }
}