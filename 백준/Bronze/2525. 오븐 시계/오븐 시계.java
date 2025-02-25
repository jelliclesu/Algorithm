import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();
        
        m += time;
        h += m / 60;
        m %= 60;
        h %= 24;  
        
        System.out.print(h + " " + m);
    }
}