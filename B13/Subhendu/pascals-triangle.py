class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ## https://leetcode.com/problems/pascals-triangle/
        ans = []
        for i in range(numRows):
            curr = [None] * (i + 1)
            curr[0], curr[-1] = 1, 1

            for j in range(1, i):
                curr[j] = ans[i - 1][j - 1] + ans[i - 1][j]
            ans.append(curr)
        return ans
