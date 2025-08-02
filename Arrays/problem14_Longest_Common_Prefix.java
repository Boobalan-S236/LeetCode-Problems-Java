// Problem: 14. Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/
// Difficulty:Easy

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) { 
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }
}

