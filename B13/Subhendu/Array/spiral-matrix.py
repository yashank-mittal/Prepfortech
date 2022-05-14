class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ## https://leetcode.com/problems/spiral-matrix/
        rows = len(matrix)
        cols = len(matrix[0])

        row_s = 0
        row_e = rows - 1
        col_s = 0
        col_e = cols - 1
        ans = []
        while len(ans) < rows * cols:

            for i in range(col_s, col_e + 1):
                ans.append(matrix[row_s][i])

            for i in range(row_s + 1, row_e + 1):
                ans.append(matrix[i][col_e])

            if row_s != row_e:
                for i in range(col_e - 1, col_s - 1, -1):
                    ans.append(matrix[row_e][i])

            if col_s != col_e:
                for i in range(row_e - 1, row_s, -1):
                    ans.append(matrix[i][col_s])
            col_s += 1
            col_e -= 1
            row_s += 1
            row_e -= 1

        return ans