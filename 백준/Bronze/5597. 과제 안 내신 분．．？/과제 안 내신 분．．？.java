import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        
        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            arr[n] = 1;
        }
        int[] result = new int[2];
        int count = 0;
        for (int i = 1; i < 31; i++) {
            if (arr[i] != 1) {
                result[count] = i;
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        Arrays.sort(result);
        System.out.println(result[0] + "\n" + result[1]);
    }
}