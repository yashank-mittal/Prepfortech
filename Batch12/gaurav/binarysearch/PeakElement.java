class Solution {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        if( nums.length==1 ) return 0;
        
        if(nums.length==2 && nums[0] > nums[1])  {
            return 0;
        } else if (nums.length==2 && nums[0] < nums[1]) {
            return 1;
        }

        while(start <= end ) {
           int mid = start + (end - start) / 2;
           if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == n-1 || nums[mid] > nums[mid+1])) {
               return mid;
           }
            
           if(nums[mid+1] >= nums[mid] ) {
               start = mid+1;
           }else{
               end = mid-1;
           }
        }
        return -1;
    }
}
