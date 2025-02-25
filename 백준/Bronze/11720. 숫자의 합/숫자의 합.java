import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        String numbers = sc.next();
        int sum = 0;
        
        for (char number : numbers.toCharArray()) {
            sum += number - '0';
        }
        System.out.println(sum);
    }
}