class Solution {
    public String mostCommonWord(String p, String[] banned) {
        Set<String> ban = new HashSet<>();
        for (String b : banned) ban.add(b);
        String[] words = p.toLowerCase().split("[^a-z]+");
        String ans = "";
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            if (!ban.contains(words[i])) {
                int count = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) count++;
                }
                if (count > max) {
                    max = count;
                    ans = words[i];
                }
            }
        }
        return ans;
    }
}
