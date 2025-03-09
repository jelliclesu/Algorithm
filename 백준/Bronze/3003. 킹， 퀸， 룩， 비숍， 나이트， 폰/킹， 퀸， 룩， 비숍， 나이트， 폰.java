import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            if (i < 2) {
                System.out.print((1 - sc.nextInt()) + " ");
            } else if (i < 5) {
                System.out.print((2 - sc.nextInt()) + " ");
            } else {
                System.out.print(8 - sc.nextInt());
            }
        }
    }
}