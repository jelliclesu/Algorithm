import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t ;i++) {
            String[] arr = br.readLine().split("");

            Stack<String> stack = new Stack<>();
            String answer = "YES";
            for (String str : arr) {
                if (str.equals("(")) {
                    stack.push("(");
                } else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) answer = "NO";
            System.out.println(answer);
        }
    }
}
