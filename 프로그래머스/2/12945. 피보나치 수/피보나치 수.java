class Solution {
    public int solution(int n) {
        int f0, fm2 = 0;
        int f1, fm1 = 1;
        int fi = 0;
        
        for (int i = 2; i <= n; i++) {
            fi = (fm2 + fm1) % 1234567;
            fm2 = fm1;
            fm1 = fi;
        }
        return fi;
    }
}