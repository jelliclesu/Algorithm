import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long answer = (long) Math.sqrt(n);
        
        System.out.println(answer);
    }
}