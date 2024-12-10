class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
            int idx = wallpaper[i].indexOf("#");
            int lastIdx = wallpaper[i].lastIndexOf("#");
            if (idx > -1 || lastIdx > -1) {
                lux = Math.min(lux, i);
                luy = Math.min(luy, idx);
                rdx = Math.max(rdx, i + 1);
                rdy = Math.max(rdy, lastIdx + 1);
            }
        }
        
        int[] answer = {lux, luy, rdx, rdy};
        
        return answer;
    }
}