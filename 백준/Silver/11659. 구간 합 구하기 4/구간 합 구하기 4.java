import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn = new StringTokenizer(buf.readLine());
        
        int n = Integer.parseInt(stn.nextToken());
        int m = Integer.parseInt(stn.nextToken());
        long[] sumArr = new long[n + 1];
        
        stn = new StringTokenizer(buf.readLine());
        for (int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(stn.nextToken());
        }
        for (int i = 0; i < m; i++) {
            stn = new StringTokenizer(buf.readLine());
            int f = Integer.parseInt(stn.nextToken());
            int s = Integer.parseInt(stn.nextToken());
            System.out.println(sumArr[s] - sumArr[f - 1]);
        }
    }
}