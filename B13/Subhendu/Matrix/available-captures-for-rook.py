class Solution:
    def numRookCaptures(self, board: List[List[str]]) -> int:
        ## https://leetcode.com/problems/available-captures-for-rook/
        for a in range(len(board)):
            for b in range(len(board[0])):
                if board[a][b] == "R":
                    x = a
                    y = b
                    break
        i = x
        j = y

        capture = 0
        while x >= 0:
            if board[x][y] == "p":
                capture += 1
                break
            elif board[x][y] == "B":
                break
            x -= 1

        x = i
        while x < len(board):
            if board[x][y] == "p":
                capture += 1
                break
            elif board[x][y] == "B":
                break
            x += 1

        # reset
        x = i

        while y >= 0:
            if board[x][y] == "p":
                capture += 1
                break
            elif board[x][y] == "B":
                break
            y -= 1

        y = j

        while y < len(board[0]):
            if board[x][y] == "p":
                capture += 1
                break
            elif board[x][y] == "B":
                break
            y += 1

        return capture
