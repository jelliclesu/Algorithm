import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int d = nums[3];
        int e = nums[4];
        int f = nums[5];
        
        int x = (c * e - b * f) / (a * e - b * d);
        int y = (c * d - a * f) / (b * d - a * e);
        
        System.out.println(x + " " + y);
    }
}