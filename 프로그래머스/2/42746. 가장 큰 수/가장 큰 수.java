import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);

        // 정렬 기준 설정 (a + b vs b + a)
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) return "0";

        return String.join("", arr);
    }
}
