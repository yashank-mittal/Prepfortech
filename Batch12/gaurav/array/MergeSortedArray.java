class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numsm = new int[m];
        int im=0;
        int jn=0;

        for(int i=0; i<m; i++) {
            numsm[i] = nums1[i];
        }

        int index=0;
        while(im < m && jn < n) {
            if(numsm[im] <= nums2[jn]) {
                nums1[index] = numsm[im];
                im++;
            }else{
                nums1[index] = nums2[jn];
                jn++;
            }
            index++;
        }

        for(int k=im; k<m; k++) {
            nums1[index] = numsm[k]; 
            index++;
        }

        for(int k=jn; k<n; k++) {
            nums1[index] = nums2[k]; 
            index++;
        }
    }
}
