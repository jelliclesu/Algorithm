import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();
        
        if (time >= 60) {
            h += time / 60;
            m += time % 60;
        } else {
            m += time;
        }
        
        if (m >= 60) {
            h += 1;
            m -= 60;
        }
        
        if (h > 23) {
            h -= 24;
        }
        
        System.out.print(h + " " + m);
    }
}