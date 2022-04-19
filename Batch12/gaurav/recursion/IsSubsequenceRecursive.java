// https://leetcode.com/problems/is-subsequence/
// find if a string is a subsequence of target string
// using recursive approach

class Solution {
    public boolean isSubseq(String s, String t, int subStrIndex, int targetStrIndex) {
        int n = t.length(); 
        int m = s.length();
        if("".equals(s)) return true;
        if(subStrIndex == m) return true;

        if(targetStrIndex == n) return false;

        if(t.charAt(targetStrIndex) == s.charAt(subStrIndex)) {
            return isSubseq(s, t, ++subStrIndex, ++targetStrIndex);
        } else {
            return isSubseq(s, t, subStrIndex, ++targetStrIndex);
        }
    }

    public boolean isSubsequence(String s, String t) {
        return isSubseq(s, t, 0, 0);
    }
}
