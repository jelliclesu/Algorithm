import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = sc.next().toCharArray();
        int i = sc.nextInt();
        
        System.out.println(arr[i - 1]);
    }
}