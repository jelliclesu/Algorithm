import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        double[] scores = new double[count];
        double maxS = 0;
        for (int i = 0; i < count; i++) {
            scores[i] = sc.nextDouble();
            maxS = Math.max(maxS, scores[i]);
        }
        
        double sum = 0;
        for (int i = 0; i < count; i++) {
            scores[i] = scores[i] / maxS * 100;
            sum += scores[i];
        }
        
        System.out.println(sum / count);
        
    }
}