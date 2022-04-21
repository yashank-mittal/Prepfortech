# Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
class Solution:
    def myPow(self, x: float, n: int) -> float:
        
        if n >= 0 :
            return self.calc_pow(x,n)
        else :
            return 1/ self.calc_pow(x, -n)
            
    def calc_pow(self,x, n):
        if n == 0:
            return 1
        power = self.myPow(x,n//2)
        
        
        if n % 2 == 0:
            return power * power
        else :
            return  power * power * x