import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char[] arr = sc.next().toCharArray();
            System.out.print(arr[0]);
            System.out.println(arr[arr.length - 1]);
        }
    }
}