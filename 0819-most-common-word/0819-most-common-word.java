import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

        List<String> ban = new ArrayList<>();
        for (int i = 0; i < banned.length; i++) {
            ban.add(banned[i]);
        }

        String ans = "";
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            if (ban.contains(words[i])) continue;

            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = words[i];
            }
        }

        return ans;
    }
}
