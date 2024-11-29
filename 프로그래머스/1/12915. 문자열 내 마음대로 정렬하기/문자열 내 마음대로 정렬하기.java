class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if ((int) strings[i].charAt(n) > (int) strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if ((int) strings[i].charAt(n) == (int) strings[j].charAt(n)) {
                    if (strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        
        return strings;
    }
}