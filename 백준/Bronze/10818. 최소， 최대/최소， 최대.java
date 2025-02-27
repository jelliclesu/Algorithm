import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int min = max;
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(min + " " + max);
    }
}