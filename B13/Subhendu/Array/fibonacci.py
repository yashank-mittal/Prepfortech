class Solution:
    def fib(self, n: int) -> int:
        ## https://leetcode.com/problems/fibonacci-number/

        if n <= 1:
            return n
        a = 0
        b = 1
        i = 2
        while i <= n:
            c = a + b
            a = b
            b = c
            i += 1
        return b