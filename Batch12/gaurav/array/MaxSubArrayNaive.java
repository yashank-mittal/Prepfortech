class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int n=nums.length;
        
        for(int i=0; i<n; i++) {
            int currentSum = 0;
            for(int j=i; j<n; j++) {
                currentSum = currentSum + nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        
        return maxSum;
    }
}
