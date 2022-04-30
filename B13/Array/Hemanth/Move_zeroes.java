//Leetcode link : https://leetcode.com/problems/move-zeroes/

//Steps :
//1. Count no of zeroes in an array.
//2. Place all the non-zero elements into the array.
//3. Then place all the zeroes at the end of an array

class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int i=0;
        for(int it : nums){
            if(it==0){
                zeros++;
            }else{
                nums[i++]=it;
            }
        }
        while(zeros>0){
            nums[i++]=0;
            zeros--;
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
