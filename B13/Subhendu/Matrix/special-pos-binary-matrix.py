class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        ## https://leetcode.com/problems/special-positions-in-a-binary-matrix/
        rowsum = [sum(i) for i in mat]
        colsum = []

        for j in range(len(mat[0])):
            s = 0
            for i in range(len(mat)):
                s += mat[i][j]
            colsum.append(s)

        ans = 0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if mat[i][j] == 1 and colsum[j] == 1 and rowsum[i] == 1:
                    ans += 1
        return ans