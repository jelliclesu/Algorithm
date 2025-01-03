import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // 문자열을 왼쪽으로 한 칸씩 회전하며 유효성 검사
        for (int i = 0; i < s.length(); i++) {
            if (isValid(s)) {
                answer++;
            }
            s = s.substring(1) + s.charAt(0); // 문자열 회전
        }

        return answer;
    }

    // 괄호 유효성 검사 함수
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // 열린 괄호를 스택에 추가
            } else {
                if (stack.isEmpty()) {
                    return false; // 닫힌 괄호가 더 많을 경우
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // 괄호가 짝이 맞지 않을 경우
                }
            }
        }

        return stack.isEmpty(); // 스택이 비어 있으면 유효
    }
}
