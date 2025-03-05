import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int answer = find(num, 0, n - 1);
            System.out.println(answer);
        }
    }

    private static int find(int num, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return 1; 
            } else if (arr[mid] < num) {
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
