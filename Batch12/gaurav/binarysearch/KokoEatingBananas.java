// https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    boolean canEatBananaUsingKSpeed(int[] piles, int limitInHours, int speed) {
        int n = piles.length;
        int totalHours = 0;
        
        for(int i=0; i<n; i++) {
            int hours = piles[i] / speed;
            if(piles[i] % speed > 0) hours++;
            totalHours = totalHours + hours;
        }
        
        if(totalHours <= limitInHours) {
            return true;
        } else {
            return false;
        }
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        
        int n = piles.length;
        int start = 1;
        int end = piles[n-1];
        int min = Integer.MAX_VALUE;
        
        while(start <= end) {
           int mid = start + (end-start) / 2;
           boolean result = canEatBananaUsingKSpeed(piles, h, mid);
           if(result) {
               min = Math.min(min, mid);
               end = mid - 1;
           } else {
               start = mid + 1;
           }
        }

        return min;
    }
}
