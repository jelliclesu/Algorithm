import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // lost/ +1/ -1 이 reserve 에 있는 지 확인
        // 없으면? n--
        // reserve 에서 빌려주면 remove
        // 먼저 자기 자신이 도난 당했는지 확인
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        for (int r : reserve) {
            reserveSet.add(r);
        }
        
        for (int l : lost) {
            if (reserveSet.contains(l)) {
                reserveSet.remove(l);
                continue;
            }
            lostSet.add(l);
        }
        for (int l : lostSet) {
            boolean b = false;
            for (int s : reserveSet) {
                if (s == l - 1 || s == l + 1) {
                    reserveSet.remove(s);
                    b = true;
                    break;
                }
            }
            if (!b) {
                n--;
            }
        }
        return n;
        
    }
}