//Leetcode Biweekly Contest - 77 problem


class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(s.startsWith(words[i])){
                count++;
            }
        }
        return count;
    }
}

//Time Complexity : O(n) -> Linear 
//Space Complexity : O(1) -> Constant
