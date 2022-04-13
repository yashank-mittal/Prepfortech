// https://leetcode.com/problems/valid-perfect-square/submissions/

class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1;
        int end=46340; // 46340 is a sqrt of Integer.MAX_VALUE; mid * mid causes overflow if end goes beyond this value
        if(num==1 || num==0) return true;
        
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if( mid*mid == num) return true;

            if ( num > mid * mid ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
