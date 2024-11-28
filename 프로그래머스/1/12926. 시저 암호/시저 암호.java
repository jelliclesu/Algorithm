class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // a = 97, z = 122, A = 65, Z = 90
    
        char arr[] = s.toCharArray();
        for (char ch : arr) {
            if (ch == ' ') {
                answer += " ";
            } else if (ch >= 'a' && ch <= 'z') {
                answer += (char) (97 + (ch + n - 97) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                answer += (char) (65 + (ch + n - 65) % 26);
            }
        }
        
        return answer;
    }
}