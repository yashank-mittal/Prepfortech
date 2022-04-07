class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int currentSum = 0;
            for(int j=i; j<n; j++) {
                currentSum = currentSum + nums[j];
                if(currentSum >= target) {
                    min = Math.min(min, Math.abs(i-j)+1);
                    break;
                }
            }
        }
        if(min ==  Integer.MAX_VALUE) return 0;
        return min;
    }
}
