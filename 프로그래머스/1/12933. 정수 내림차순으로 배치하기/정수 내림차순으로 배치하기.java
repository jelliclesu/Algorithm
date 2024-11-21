class Solution {
    public long solution(long n) {
        String str[] = String.valueOf(n).split("");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (Integer.valueOf(str[i]) < Integer.valueOf(str[j])) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return Long.valueOf(String.join("", str));
    }
}