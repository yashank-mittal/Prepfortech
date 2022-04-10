"""Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. 
Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
"""
class Solution:
      
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        start_speed = 1
        end_speed = max(piles)
        while start_speed < end_speed:
            mid_speed = start_speed + (end_speed - start_speed)//2
            h_total = 0
            for pile  in piles:
                h_used = pile/mid_speed
                h_total += h_used if (h_used - int(h_used)) <= 0 else int(h_used)+1 
            if h_total <= h:
                end_speed = mid_speed
            else:
                start_speed = mid_speed + 1 
        return end_speed