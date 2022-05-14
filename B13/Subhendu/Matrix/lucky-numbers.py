class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        ## https://leetcode.com/problems/lucky-numbers-in-a-matrix/
        min_row = {min(i) for i in matrix}
        max_col = set()
        for j in range(len(matrix[0])):
            col_max = -float('inf')
            for i in range(len(matrix)):
                col_max = max(col_max, matrix[i][j])
            max_col.add(col_max)

        return min_row.intersection(max_col)