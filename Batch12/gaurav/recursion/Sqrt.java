// https://leetcode.com/problems/sqrtx/
// find a square root of a number using recursive method

class Solution {
    public int sqrt(int x, double start, double end){
        double mid = start + (end - start ) / 2;
        double square = mid * mid;
        if( square == x ||   (Math.abs(square - x) < 0.00001)){
            return new Double(mid).intValue();
        } else if (square < x) {
            return sqrt(x, mid, end);
        }else{
            return sqrt(x, start, mid);
        }
    }
    
    public int mySqrt(int x) { 
        double start  = 0;
        double end = x;
        double mid  = start + (end - start ) / 2;
        if(x == 1 || x == 0) return x;
        if(mid * mid == x) return new Double(mid).intValue();
        mid = sqrt(x, start, end);
        return new Double(mid).intValue();
    }
} 
