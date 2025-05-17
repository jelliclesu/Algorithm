import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                list.add(name);
            }
        }
        
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(list.size());
        System.out.println(sb.toString());
    }
}