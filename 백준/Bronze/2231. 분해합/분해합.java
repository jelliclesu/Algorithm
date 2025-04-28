import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nStr = sc.next();
        int n = Integer.parseInt(nStr);
        int len = nStr.length();
        
        int start = Math.max(1, n - 9 * len);
        
        int answer = 0;
        for (int i = start; i < n; i++) {
            int sum = i;
            int temp = i;
            
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            if (sum == n) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}
