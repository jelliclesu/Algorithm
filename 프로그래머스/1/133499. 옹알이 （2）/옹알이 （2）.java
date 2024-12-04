import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] validWords = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            boolean isValid = true;

            String previous = "";
            int index = 0;

            while (index < word.length() && isValid) {
                boolean found = false;

                for (String valid : validWords) {
                    if (word.startsWith(valid, index)) {
                        if (valid.equals(previous)) { 
                            isValid = false;
                            break;
                        }
                        index += valid.length();
                        previous = valid;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}
