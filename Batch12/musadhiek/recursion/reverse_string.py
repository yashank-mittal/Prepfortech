
"""Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
"""

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
       """
        def swapper(s,count):
            if count >= len(s)/2:
                return 
            s[count],s[len(s)-count-1]=s[len(s)-count-1],s[count]
            swapper(s,count+1)
        swapper(s,0)
        return
            