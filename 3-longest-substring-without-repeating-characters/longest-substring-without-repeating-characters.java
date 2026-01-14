class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] idx = new int[128];
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, idx[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            idx[c] = right + 1;
        }

        return maxLen;
    }
}
