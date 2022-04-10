// https://leetcode.com/problems/majority-element/submissions/
// MajorityElement using moors algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;
        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(majorityElement == nums[i]) { 
                count++;
            } else if (majorityElement != nums[i]) {
                count--;
                if(count == 0) {
                    majorityElement = nums[i];
                    count++;
                }
            }
            
        }
        int verifyCount = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == majorityElement) verifyCount++;
        }
        
        if(verifyCount > n/2) return majorityElement;
        else return Integer.MIN_VALUE;
    }
}
