class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countmax = 0;
        
        int n = nums.length;
        int index = 0;
        
        int count = 0;
        while(index < n) {
            if(nums[index] == 1) {
                count ++;  
            }
            
            if(nums[index] != 1 || index == n-1) {
                countmax = Math.max(count,  countmax);
                count = 0;
            }

            index++;
        }
        return countmax;
    }
}
