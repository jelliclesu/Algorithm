import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] arr = new String[15][15];
        
        for (int i = 0; i < 5; i++) {
            String[] str = sc.nextLine().split("");
            int len = str.length;
            for (int j = 0; j < len; j++) {
                arr[j][i] = str[j];
            }
        }
        for (String[] s : arr) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] != null) System.out.print(s[i]);
            }
        }
    }
}