class Solution {  
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j=0;
        HashSet<Character> set = new HashSet<Character>();
        int max=0;
        
        for(int i=0; i < n; i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                ++j;
            }

            set.add(s.charAt(i));
            int winlen = i-j+1;
            max = Math.max(winlen, max);
        }

        return max;
    }
}
