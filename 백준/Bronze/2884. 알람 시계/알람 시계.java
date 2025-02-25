import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (m >= 45) {
            System.out.print(h + " " + (m - 45));
        } else if (h == 0) {
            System.out.print(23 + " " + (m - 45 + 60));
        } else {
            System.out.print((h-1) + " " + (m - 45 + 60));
        }
    }
}