class Solution {
    public int trap(int[] height) {
        int result = 0;
        int lmax=height[0];
        int n=height.length;
        for(int i=0; i<n;i++) {
            int lMax = height[i];
            for(int j=0; j<i; j++) {
                lMax = Math.max(lMax, height[j]);
            }
            int rMax = height[i];
            for(int j=i+1; j<n; j++){
                rMax = Math.max(rMax, height[j]);
            }
            result = result + (Math.min(lMax, rMax) - height[i]);
        }
        return result;
    }
}
