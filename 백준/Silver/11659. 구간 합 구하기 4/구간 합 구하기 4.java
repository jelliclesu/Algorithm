import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] sumArr = new int[n + 1];
        int[] result = new int[m];
        
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            if (i == 1) {
                sumArr[i] = arr[i];
            } else {
                sumArr[i] = arr[i] + sumArr[i - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            result[i] = sumArr[s] - sumArr[f - 1];
        }
        
        for (int r : result) {
            System.out.println(r);
        }
    }
}