import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arr = sc.nextLine().split("-");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] plusArr = arr[i].split("\\+");
            int plus = 0;
            for (String str : plusArr) {
                plus += Integer.parseInt(str);
            }
            if (i == 0) sum += plus;
            else sum -= plus;
        }
        System.out.println(sum);
    }
}