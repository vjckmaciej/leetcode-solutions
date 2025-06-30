class Solution {
    public boolean isPalindrome(String s) {
        String lowercaseString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0, j = lowercaseString.length()-1; i < j; i++, j--) {
            if (lowercaseString.charAt(i) != lowercaseString.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}