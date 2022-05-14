class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        ## https://leetcode.com/problems/reshape-the-matrix/
        new_mat = [[None] * c for i in range(r)]
        r_i = 0
        c_i = 0
        total = 0
        if r * c != len(mat) * len(mat[0]):
            return mat

        for i in range(len(mat)):
            for j in range(len(mat[0])):
                total += 1
                new_mat[r_i][c_i % c] = mat[i][j]
                if total % c == 0:
                    r_i += 1
                c_i += 1
        return new_mat