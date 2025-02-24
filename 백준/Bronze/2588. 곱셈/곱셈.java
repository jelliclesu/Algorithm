import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = a * b;
        while (b > 0) {
            System.out.println(a * (b%10));
            b /= 10;
        }
        System.out.print(c);
    }
}