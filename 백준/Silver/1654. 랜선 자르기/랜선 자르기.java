import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];
        
        int max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        
        long left = 1;
        long right = max;
        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int a : arr) {
                count += a / mid;
            }
            if (count < n) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }
        System.out.println(result);
    }
}