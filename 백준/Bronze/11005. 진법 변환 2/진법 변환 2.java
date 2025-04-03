import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int b = sc.nextInt();
    Stack<Character> stack = new Stack<>();
    
    while (n != 0) {
      int r = n % b;
      char c;
      if (r < 10) {
        c = (char) (r + '0');
      } else {
        c = (char) (r + 'A' - 10);
      }
      stack.push(c);
      n /= b;
    }
    
    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    System.out.println(sb.toString());
  }
}