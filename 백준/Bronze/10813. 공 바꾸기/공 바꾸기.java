import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int a = 1; a <= n; a++) {
            arr[a] = a;
        }
        
        for (int q = 1; q <= m; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for (int p = 1; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }

    }
}