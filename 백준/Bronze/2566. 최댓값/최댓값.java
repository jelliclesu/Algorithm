import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = -1;
        int row = 0, col = 0;
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int now = Integer.parseInt(st.nextToken());
                max = Math.max(max, now);
                if (max == now) {
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}