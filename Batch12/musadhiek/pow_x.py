# Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        neg = False
        if n < 0:
            neg = True
            n *= -1
        total=1
        while n:
            if n % 2:
                total *= x
                n -= 1 
            else:
                x *= x
                n = n//2
        if neg :
            return (1/total)
        return total