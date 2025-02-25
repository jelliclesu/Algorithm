import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int maxS = 0;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            int score = sc.nextInt();
            sum += score;
            maxS = Math.max(maxS, score);
        }
        
        System.out.println(sum * 100 / maxS / count);
        
    }
}