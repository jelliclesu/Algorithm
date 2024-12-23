import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        String[] todayArr = today.split("\\.");
        int todayYear = Integer.parseInt(todayArr[0]);
        int todayMonth = Integer.parseInt(todayArr[1]);
        int todayDay = Integer.parseInt(todayArr[2]);

        // 약관 종류와 유효기간을 맵으로 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] termArr = term.split(" ");
            termMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }

        // 각 개인정보 유효기간 검증
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyArr = privacies[i].split(" ");
            String[] dateArr = privacyArr[0].split("\\.");
            int privacyYear = Integer.parseInt(dateArr[0]);
            int privacyMonth = Integer.parseInt(dateArr[1]);
            int privacyDay = Integer.parseInt(dateArr[2]);

            // 유효기간 추가
            String termType = privacyArr[1];
            int termMonths = termMap.get(termType);
            privacyMonth += termMonths;
            
            // 날짜 조정
            if (privacyMonth > 12) {
                privacyYear += (privacyMonth - 1) / 12;
                privacyMonth = (privacyMonth - 1) % 12 + 1;
            }

            // 현재 날짜와 비교
            if (privacyYear < todayYear || 
                (privacyYear == todayYear && privacyMonth < todayMonth) ||
                (privacyYear == todayYear && privacyMonth == todayMonth && privacyDay <= todayDay)) {
                result.add(i + 1);
            }
        }

        // 결과를 int 배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
