class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 공원 크기
        int parkRow = park.length;
        int parkCol = park[0].length();

        // 시작 지점 찾기
        int startRow = 0, startCol = 0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].indexOf("S") > -1) {
                startRow = i;
                startCol = park[i].indexOf("S");
                break;
            }
        }

        // 이동 처리
        for (String route : routes) {
            String[] arr = route.split(" ");
            String direction = arr[0];
            int distance = Integer.parseInt(arr[1]);

            int newRow = startRow;
            int newCol = startCol;

            boolean isBlocked = false;

            // 이동 시뮬레이션
            for (int i = 1; i <= distance; i++) {
                switch (direction) {
                    case "N":
                        newRow = startRow - i;
                        break;
                    case "S":
                        newRow = startRow + i;
                        break;
                    case "W":
                        newCol = startCol - i;
                        break;
                    case "E":
                        newCol = startCol + i;
                        break;
                }

                // 경계값 및 장애물 체크
                if (newRow < 0 || newRow >= parkRow || newCol < 0 || 
                    newCol >= parkCol || park[newRow].charAt(newCol) == 'X') {
                    isBlocked = true;
                    break;
                }
            }

            // 이동 가능하면 위치 갱신
            if (!isBlocked) {
                startRow = newRow;
                startCol = newCol;
            }
        }

        // 최종 위치 반환
        return new int[]{startRow, startCol};
    }
}