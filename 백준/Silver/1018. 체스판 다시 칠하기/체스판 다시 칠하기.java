import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0 ; j <= m - 8; j++) {
                int countB = 0, countW = 0;
                
                for (int k = 0; k < 8; k++) {
                    String s = arr[i + k].substring(j, j + 8);
                    if (k % 2 == 0) {
                        countB += countDiff("BWBWBWBW", s);
                        countW += countDiff("WBWBWBWB", s);
                    } else {
                        countB += countDiff("WBWBWBWB", s);
                        countW += countDiff("BWBWBWBW", s);
                    }
                }
                int min = Math.min(countB, countW);
                answer = Math.min(answer, min);
            }
        }
        System.out.println(answer);
    }
    
    private static int countDiff(String chess, String s) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (chess.charAt(i) != s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}