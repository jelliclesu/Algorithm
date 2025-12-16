import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] numbersStr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(numbersStr, (a , b) -> (b + a).compareTo(a + b));
        
        if (numbersStr[0].equals("0")) return "0";
        
        return String.join("", numbersStr);
    }
}