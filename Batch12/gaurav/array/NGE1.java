class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        HashMap<Integer, Integer> mapnge = new HashMap<Integer, Integer>();
        int[] res = new int[nums1.length];

        for(int i=0; i<n2; i++) {
            int next = -1;
            for(int j=i+1; j<n2;j++) {
                if(nums2[j] > nums2[i]) {
                    next = nums2[j];
                    break;
                }
            }
            mapnge.put(nums2[i], next);
        }
        
        for(int i=0; i<nums1.length;i++) {
            res[i] = mapnge.get(nums1[i]);
        }
        
        return res;
    }
}
