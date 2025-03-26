import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, PriorityQueue<int[]>> map = new HashMap<>();
        Map<String, Integer> genreMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            genreMap.put(genre, genreMap.getOrDefault(genre, 0) + play);
            map.putIfAbsent(genre, new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] == b[0]) return a[1] - b[1];
                    return b[0] - a[0];
                }));
            map.get(genre).add(new int[]{play, i});
        }
        
        List<String> sortedGenres = new ArrayList<>(genreMap.keySet());
        sortedGenres.sort((a, b) -> genreMap.get(b) - genreMap.get(a));
        
        for (String s : sortedGenres) {
            PriorityQueue<int[]> queue = map.get(s);
            for (int i = 0; i < 2 && !queue.isEmpty(); i++) {
                int[] best = queue.poll();
                answer.add(best[1]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}