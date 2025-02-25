import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        int maxNum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            maxNum = Math.max(maxNum, nums[i]); 
        }
        
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            System.out.print(10000 + nums[0] * 1000);
        } else if (nums[0] == nums[1] || nums[0] == nums[2]) {
            System.out.print(1000 + nums[0] * 100);
        } else if (nums[1] == nums[2]) {
            System.out.print(1000 + nums[1] * 100);
        } else {
            System.out.print(maxNum * 100);
        }
    }
}