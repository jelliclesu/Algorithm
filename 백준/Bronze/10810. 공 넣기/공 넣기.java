import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int q = 0; q < m; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for (int s = i - 1; s < j; s++) {
                arr[s] = k;
            }
        }
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}