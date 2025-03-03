import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String[] s = sc.next().split("");
            String answer = "";
            for (int j = 0; j < s.length; j++) {
                answer += s[j].repeat(r);
            }
            System.out.println(answer);
        }
    }
}