class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] alphabetAsNum = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabetAsNum[s.charAt(i) - 'a']++;
            alphabetAsNum[t.charAt(i) - 'a']--;
        }

        for (int num : alphabetAsNum) {
            if (num != 0) return false;
        }

        return true;
    }
}