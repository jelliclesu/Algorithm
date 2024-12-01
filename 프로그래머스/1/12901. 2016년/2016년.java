class Solution {
    public String solution(int a, int b) {
        // 윤년 - 366일, 2월 29일 존재
        String answer = "";
        String[] days = {"THU" ,"FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = b;
        for (int i = 0; i < a - 1; i++) {
            date += dates[i];
        }
        answer = days[date % 7];
        return answer;
    }
}