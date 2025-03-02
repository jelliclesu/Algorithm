import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 요청 시간 기준으로 오름차순
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> pQueue = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0];
                return a[1] - b[1];
            });
        
        int time = 0;
        int sum = 0;
        int index = 0;
        int count = 0;
        
        while (count < jobs.length) {
            // 현재 시간 이하의 작업을 큐에 넣음
            while (index < jobs.length && jobs[index][0] <= time) {
                pQueue.add(jobs[index]);
                index++;
            }
            if (!pQueue.isEmpty()) {
                int[] job = pQueue.poll();
                count++;
                time += job[1]; // 실행 시간만큼 현재 시간 증가
                sum += time - job[0];   // 현재 시간 - 소요 시간
            } else {
                time = jobs[index][0];
            }
        }
        return sum / jobs.length;
    }
}