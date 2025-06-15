import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        String first = br.readLine();
        int answer = 0;
        for (int i = 0; i < N - 1; i++) {
            String str = br.readLine();
            if (!str.equals("ENTER")) {
                set.add(str);
            } else {
                answer += set.size();
                set.clear();
            }
        }
        answer += set.size();
        System.out.println(answer);
    }
}
