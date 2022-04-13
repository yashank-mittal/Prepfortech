// https://leetcode.com/problems/reverse-string/submissions/

class Solution {
    void reverse(char[] arr, int i, int j) {
        if( i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr, ++i, --j);
        }
    }
    
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
}
