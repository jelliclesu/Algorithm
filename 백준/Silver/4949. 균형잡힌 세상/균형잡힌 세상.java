import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] arr = br.readLine().split("");
            if (arr[0].equals(".")) return;

            Stack<String> stack = new Stack<>();
            String answer = "yes";
            for (String str : arr) {
                if (str.equals("(") || str.equals("[")) {
                    stack.push(str);
                } else if (str.equals(")") || str.equals("]")){
                    if (stack.isEmpty()) {
                        answer = "no";
                        break;
                    }

                    String top = stack.pop();
                    if ((str.equals(")") && !top.equals("("))
                    || str.equals("]") && !top.equals("[")) {
                        answer = "no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) answer = "no";

            System.out.println(answer);
        }
    }
}