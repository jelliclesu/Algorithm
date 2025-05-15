import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<Integer, String> iMap = new HashMap<>();
        Map<String, Integer> sMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            iMap.put(i, name);
            sMap.put(name, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (isNumber(s)) {
                sb.append(iMap.get(Integer.parseInt(s))).append("\n");
            } else {
                sb.append(sMap.get(s)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    private static boolean isNumber(String s) {
        if (s.matches("[0-9]+")) return true;
        return false;
    }
}