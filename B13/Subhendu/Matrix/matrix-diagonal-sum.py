class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ## https://leetcode.com/problems/matrix-diagonal-sum/
        n = len(mat)
        s = 0
        for i in range(n):
            j = n - 1 - i
            if i != j:
                s += mat[i][i] + mat[i][j]
            else:
                s += mat[i][i]
        return s