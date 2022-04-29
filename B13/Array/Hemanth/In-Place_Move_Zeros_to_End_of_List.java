/*
1. Counting number of zeroes in an array.
2. Placing all the non-zero elements into the array.
3. Placing all the zeroes at the end of the array.
*/

import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int zeros = 0;          
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
        return nums;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
