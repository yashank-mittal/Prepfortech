class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for(int i=0; i<n; i++) {
            result.put(nums[i], i);
        }
        
        for(int i=0; i<n; i++) {
            if(result.get(target - nums[i]) != null && i != result.get(target - nums[i]) ) {
                res[0] = i;
                res[1] = result.get(target-nums[i]);
                return res;
            }
        }
        return res;
    }
}
