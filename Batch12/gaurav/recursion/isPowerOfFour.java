// https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPower(int n) {
        if(n == 1) return true;
        if(n % 4 == 0) return isPower(n/4);	
        else return false;
    }
    
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        else return isPower(n);
    }
}
