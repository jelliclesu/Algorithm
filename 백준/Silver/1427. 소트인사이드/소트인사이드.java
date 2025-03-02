import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        String[] arr = n.split("");
        for (int j = 0; j < arr.length; j++) {
            int max = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[max])) {
                    max = i;
                }
            }
            String temp = arr[j];
            arr[j] = arr[max];
            arr[max] = temp;
        }
        System.out.println(String.join("", arr));
    }
}