import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(), y = sc.nextInt();
        int w = sc.nextInt(), h = sc.nextInt();
        
        int minX = Math.min(x - 0, w - x);
        int minY = Math.min(y - 0, h - y);
        System.out.println(Math.min(minX, minY));
    }
}