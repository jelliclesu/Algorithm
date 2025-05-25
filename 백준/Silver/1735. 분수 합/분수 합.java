import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int ja = (a1 * b2) + (a2 * b1);
        int mo = b1 * b2;

        for (int i = Math.min(mo, ja); i > 0; i--) {
            if (ja % i == 0 && mo % i == 0) {
                System.out.println((ja / i) + " " + (mo / i));
                break;
            }
        }
    }
}