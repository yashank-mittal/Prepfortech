class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:
        ## https://leetcode.com/problems/toeplitz-matrix/
        for r in range(len(matrix)):
            for c in range(len(matrix[0])):
                if (r > 0 and c > 0 and matrix[r-1][c-1] != matrix[r][c]):
                    return False
        return True