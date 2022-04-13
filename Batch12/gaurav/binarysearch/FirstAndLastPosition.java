// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int[] result = new int[] {-1, -1};
        if(n == 1 ) {
            if ( nums[0] == target ) {
                result[0] = 0; 
                result[1] = 0;  
                return result;
            }
            
            return result;
        }
        
        while(start <= end ) {
            int mid = start + (end-start)  / 2;
            
            if (nums[mid] == target) {
                int l = mid;
                int h = mid;
                while(l >= 0 && nums[l] == target) {
                    l--;
                }
                
                while(h < n && nums[h] == target) {
                    h++;
                }
                
                result[0] = l+1;
                result[1] = h-1;
            }
            
            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } 
        return result;
    }
}
