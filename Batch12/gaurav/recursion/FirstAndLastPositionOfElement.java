// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int findFirst(int[] nums, int target, int start, int end) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if(target <= nums[mid]) {
                return findFirst(nums, target, start, mid-1);
            } else {
                return findFirst(nums, target, mid+1, end);
            }    
        }
        if(start >= 0 && start < nums.length && nums[start] == target ) return start;
        else return -1;
    }
    
    public int findLast(int[] nums, int target, int start, int end) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if(target >= nums[mid]) {
                return findLast(nums, target, mid+1, end);
            } else {
                return findLast(nums, target, start, mid-1);
            }    
        }
        
        if(end < nums.length && end >= 0 && nums[end] == target ) return end;
        else return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int[] result = new int[] {-1, -1};
    
        result[0] = findFirst(nums, target, start, end);
        result[1] = findLast(nums, target, start, end);
       
        return result;
    }
}
