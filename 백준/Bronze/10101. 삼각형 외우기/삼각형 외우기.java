import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            set.add(a);
            sum += a;
        }
        
        if (sum != 180) {
            System.out.println("Error");
            return;
        }
        
        switch (set.size()) {
            case 1: System.out.println("Equilateral");
                break;
            case 2: System.out.println("Isosceles");
                break;
            case 3: System.out.println("Scalene");
                break;
        }
    }
}