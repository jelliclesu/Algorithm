import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        String reverseA = new StringBuilder(a).reverse().toString();
        String reverseB = new StringBuilder(b).reverse().toString();
        if (Integer.parseInt(reverseA) > Integer.parseInt(reverseB)) {
            System.out.println(reverseA);
        } else {
            System.out.println(reverseB);
        }
    }
}