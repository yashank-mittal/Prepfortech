// https://leetcode.com/problems/is-subsequence/
// check if string is a subsequence of target string

class Solution {
    public boolean isSubsequence(String s, String t) {
        int subStrIndex = 0; 
        int targetStrIndex = 0; 
        int n = t.length(); 
        int m = s.length();
        
        if("".equals(s)) return true;

        while(targetStrIndex < n && subStrIndex < m) {
            if(t.charAt(targetStrIndex) == s.charAt(subStrIndex)) {
                if(subStrIndex == s.length()-1) return true;
                else subStrIndex++;
            }
            targetStrIndex++;
        }

        return false;
    }
}
