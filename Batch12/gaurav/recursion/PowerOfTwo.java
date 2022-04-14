
class Solution {
    public boolean isPower(int x) {
        if(x == 1) return true;
        if(x % 2 == 0) return isPower(x/2);	
        else return false;
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        return isPower(n);
    }
}
