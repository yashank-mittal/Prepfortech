class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            for(int j=0; j <= i; j++){
                if(nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
