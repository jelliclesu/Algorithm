import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int maxIndex = people.length - 1;
        int minIndex = 0;
        int max = people[maxIndex];
        int min = people[0];
        int answer = 0;
        
        while (minIndex <= maxIndex) {
            if (people[minIndex] + people[maxIndex] <= limit) {
                answer++;
                maxIndex--;
                minIndex++;
            } else {
                answer++;
                maxIndex--;
            }
        }
        
        return answer;
    }
}