class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[] = s.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        answer = String.join("", arr);
        return answer;
    }
}