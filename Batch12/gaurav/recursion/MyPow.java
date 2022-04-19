// https://leetcode.com/problems/powx-n/
// stack overflow error for large value of n

class Solution {
    public double postivePow(double x, int n) {
        if(n == 0) return 1;
        return x * postivePow(x, n-1);
    }
    
    public double myPow(double x, int n) {
        double result = postivePow(x, Math.abs(n));
        if(n < 0) return 1 / result;
        else return result;
    }
}
