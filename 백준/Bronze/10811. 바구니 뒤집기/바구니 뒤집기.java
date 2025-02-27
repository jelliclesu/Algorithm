import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int s = 1; s <= n; s++) {
            arr[s] = s;
        }
        
        for (int q = 0; q < m; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            // 투 포인터
            while(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        for (int t = 1; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}