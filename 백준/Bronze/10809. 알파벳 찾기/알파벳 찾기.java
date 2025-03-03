import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        int[] answer = new int[26];
        
        for (int k = 0; k < answer.length; k++) {
            answer[k] = -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i] - 'a';
            if (answer[n] == -1) {
                answer[n] = i;
            }
        }
        for (int j = 0; j < answer.length; j++) {
            System.out.print(answer[j] + " ");
        }
    }
}