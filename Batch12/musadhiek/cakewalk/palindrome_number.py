"""
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
"""
#method 1
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        return True if x[::1]==x[::-1] else False
#method 2
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        for char in range(0,len(x)-1):
            if x[char] != x[-char-1]:
                return False
        return True
#metod 3
class Solution:
    def isPalindrome(self, x: int) -> bool:
        tem = x
        rev =0
        while x >0:
            dig = x % 10
            rev = rev*10 + dig
            x=x//10
        if tem == rev:
            return True
        return False