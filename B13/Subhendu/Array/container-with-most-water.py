class Solution:
    def maxArea(self, height: List[int]) -> int:
        ## https://leetcode.com/problems/container-with-most-water/
        l = 0
        r = len(height) - 1
        maxarea = 0
        while l < r:
            width = r - l
            maxarea = max(maxarea, min(height[l], height[r]) * width)

            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return maxarea