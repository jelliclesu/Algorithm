class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        int index = 0;
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[arr.length - 1];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}