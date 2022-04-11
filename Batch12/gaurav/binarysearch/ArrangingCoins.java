// https://leetcode.com/problems/arranging-coins/

class Solution {
    boolean canBuildNRowStairCase(long n, int target) {
        long result = n * (n-1) / 2;
        if(result <= target) return true;
        return false;
    }

    
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        if(n==1) return 1;
        
        while(start <= end ) {
            long mid = start + (end-start) / 2;
            boolean res = canBuildNRowStairCase(mid, n);
            if(res) {
                start = mid+1;
            } else { 
                end = mid -1 ;
            }
        }

        return (int)end-1;
    }
}
