class Solution {
    public boolean isValid(String word) {
         if (word.length() < 3) return false; 
        boolean Vowel = false;
        boolean Consonant = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isLetterOrDigit = 
                (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');

            if (!isLetterOrDigit) return false;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                Vowel = true;
            } 
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                Consonant = true;
            }
        }
       return Vowel && Consonant;
    }
}
