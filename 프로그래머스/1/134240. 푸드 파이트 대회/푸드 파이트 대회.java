class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        for (int i = 0; i < food.length; i++) {
            if (food[i] > 1) {
                str += String.valueOf(i).repeat(food[i] / 2);
            }
        }
        String revStr = new StringBuilder(str).reverse().toString();
        answer = str + "0" + revStr;
        return answer;
    }
}