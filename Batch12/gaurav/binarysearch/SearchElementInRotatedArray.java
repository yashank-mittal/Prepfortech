// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    int findPivot(int[] nums, int start, int end) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid+1]) {
                return mid;
            }
            
            if(nums[mid] < nums[0]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
    
    int search(int[] nums, int target, int start, int end){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            
            if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
        
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;
        int pivot = findPivot(nums, 0, n-2);
        int result = -1;
        System.out.println(pivot);
        
        result = search(nums, target, 0, pivot);
        
        if(result == -1) {
            result =search(nums, target, pivot+1, n-1);
        }
        
        return result;
    }
}
