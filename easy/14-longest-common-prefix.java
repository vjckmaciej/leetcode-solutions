class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder commonPrefix = new StringBuilder();
        int indexOfChar = 0;
        boolean doesAllContain = true;

        while (doesAllContain) {
            if (indexOfChar >= strs[0].length()) break;
            char currentChar = strs[0].charAt(indexOfChar);

            for (String word : strs) {
                if (indexOfChar >= word.length() || word.charAt(indexOfChar) != currentChar) {
                    doesAllContain = false;
                    break;
                }
            }

            if (doesAllContain) {
                commonPrefix.append(currentChar);
                indexOfChar++;
            }
        }

        return commonPrefix.toString();
    }
}
