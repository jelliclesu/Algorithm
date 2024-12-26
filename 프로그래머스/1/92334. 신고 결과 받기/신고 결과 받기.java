import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 내역 저장 (중복 신고 제거)
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>()); // 각 사용자별 신고자 저장
        }
        for (String entry : report) {
            String[] ids = entry.split(" ");
            String reporter = ids[0]; // 신고자
            String reported = ids[1]; // 신고당한 사람
            reportMap.get(reported).add(reporter); // 신고자 저장 (중복 방지)
        }

        // 신고당한 횟수 계산
        Map<String, Integer> warningMap = new HashMap<>();
        for (String id : id_list) {
            warningMap.put(id, reportMap.get(id).size());
        }

        // 메일 수 저장
        int[] answer = new int[id_list.length];
        Map<String, Integer> mailMap = new HashMap<>();
        for (String id : id_list) {
            mailMap.put(id, 0);
        }
        for (String reported : id_list) {
            // 신고당한 횟수가 k 이상이면 메일 발송
            if (warningMap.get(reported) >= k) {
                for (String reporter : reportMap.get(reported)) {
                    mailMap.put(reporter, mailMap.get(reporter) + 1);
                }
            }
        }

        // 결과 배열 생성
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailMap.get(id_list[i]);
        }

        return answer;
    }
}