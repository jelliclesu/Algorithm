class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 행 x arr2의 열
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) { // arr1의 행 순회
            for (int j = 0; j < arr2[0].length; j++) { // arr2의 열 순회
                for (int k = 0; k < arr1[0].length; k++) { // arr1의 열 == arr2의 행 순회
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
