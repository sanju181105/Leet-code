class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int ans = 0;
        for (char c : s.toCharArray())
            freq[c]++;
        for (int count : freq) {
            if (count % 2 == 0)
                ans += count;
            else
                ans += count - 1;
        }
        if (ans < s.length())
            ans++;

        return ans;
    }
}
