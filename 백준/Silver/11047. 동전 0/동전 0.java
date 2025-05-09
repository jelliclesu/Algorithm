import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = n - 1; i > -1; i--) {
            if (arr[i] <= k) {
                sum += k / arr[i];
                k %= arr[i];
            }
        }
        System.out.println(sum);
    }
}