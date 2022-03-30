// Time limit exceeds

class Solution {
    
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;  
        int mid = start + (end - start ) / 2;
        int pivot = mid;

        while (start <= end ) {
            mid = start + (end - start ) / 2;

            if(nums[mid] >nums[mid+1]) {
                pivot = mid;
                return nums[mid+1];
            }

            if(nums[mid] > nums[end]) {
                start = mid;
            } else {
                end = mid;
            }     
        }
        
  
        
        return -1;
    }
}
