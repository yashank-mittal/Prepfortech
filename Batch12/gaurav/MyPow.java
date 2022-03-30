class Solution {
    public double myPow(double x, int n) {
        
        double result = x;
        
        for(int i=2; i <= n; i++ ) {
            result = result * x;
        }
        
        return result;
    }
}
