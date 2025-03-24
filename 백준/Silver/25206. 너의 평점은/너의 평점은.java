import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = Map.of(
        "A+", 4.5,
        "A0", 4.0,
        "B+", 3.5,
        "B0", 3.0,
        "C+", 2.5,
        "C0", 2.0,
        "D+", 1.5,
        "D0", 1.0,
        "F", 0.0
        );
        
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double credit = 0.0;
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double cre = sc.nextDouble();
            String grade = sc.next();
            if (grade.equals("P")) {
                continue;
            }
            sum += map.get(grade) * cre;
            credit += cre;
        }
        System.out.println(sum / credit);
    }
}