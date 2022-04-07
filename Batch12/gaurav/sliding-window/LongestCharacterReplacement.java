class Solution {
    int maxOccuringCharCount(String s, int start, int end) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=start; i<=end; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int value: map.values()) {
            max  = Math.max(max, value);
        }

        return max;
    }

    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max = Integer.MIN_VALUE; 
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int winSize = Math.abs(i-j) + 1;
                int maxCharcount = maxOccuringCharCount(s, i, j);
                int replacementCount = winSize - maxCharcount;
                if(replacementCount <= k) {
                    max = Math.max(winSize, max);
                }

            }
        }
        return max;
    }
}
