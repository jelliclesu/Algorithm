class Solution {
    public int solution(String s) {
        int answer = 0;
        String numArr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(numArr[i], String.valueOf(i));
        }
        answer = Integer.valueOf(s);
        return answer;
    }
}