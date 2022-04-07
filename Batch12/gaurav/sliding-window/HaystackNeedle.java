class Solution {
    int searchFromIndex(int index,String haystack, String needle) {
        int newindex = index;
        int n = needle.length();
        int m = haystack.length();

        int counter=1;
        for(int i=0; i<n && index < m; i++) {
            if(needle.charAt(i) != haystack.charAt(index)) return -1;
            index++;
            counter++;
        }
        System.out.println(counter);
        
        if(counter-1 == n) return newindex;
        else return -1;
    }
    
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        for(int i=0; i<n; i++){
            int index = searchFromIndex(i, haystack, needle);
            if( index != -1) return index;
        }
        return -1;
    }
}
