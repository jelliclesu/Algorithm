import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        int[] nums = new int[]{
            2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9
        };
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += nums[arr[i] - 'A'] + 1;
        }
        System.out.println(answer);
    }
}