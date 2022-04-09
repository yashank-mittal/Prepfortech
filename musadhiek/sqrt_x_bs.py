"""
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned."""
class Solution:
    def mySqrt(self, x: int) -> int:
        start = 0
        end = x
        
        while start<= end:
            mid = start + (end-start)//2  #end-start is used to avoid integer memmory overflow
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                sqrt = mid
                start = mid +1
            elif mid * mid > x:
                end = mid - 1
        return sqrt