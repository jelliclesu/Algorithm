import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int[] result = isPalindrome(str);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    private static int[] isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1, 1);
    }

    private static int[] recursion(String str, int l, int r, int count) {
        if (l >= r) return new int[]{1, count};
        else if (str.charAt(l) != str.charAt(r)) return new int[]{0, count};
        return recursion(str, l + 1, r - 1, count + 1);
    }
}
