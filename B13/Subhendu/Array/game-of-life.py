class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        ## https://leetcode.com/problems/game-of-life/
        new_board = [[0] * len(board[0]) for i in range(len(board))]
        directions = [[0, 1], [0, -1], [1, 0], [-1, 0], [1, 1], [-1, -1], [1, -1], [-1, 1]]
        for i in range(len(board)):
            for j in range(len(board[0])):
                live = 0
                for off_x, off_y in directions:
                    x = i + off_x
                    y = j + off_y

                    if not (0 <= x < len(board) and 0 <= y < len(board[0])):
                        continue
                    if board[x][y] == 1:
                        live += 1

                if live < 2:
                    new_board[i][j] = 0
                elif live in [2, 3] and board[i][j] == 1:
                    new_board[i][j] = 1
                elif live > 3 and board[i][j] == 1:
                    new_board[i][j] = 0
                elif live == 3 and board[i][j] == 0:
                    new_board[i][j] = 1

        for i in range(len(board)):
            for j in range(len(board[0])):
                board[i][j] = new_board[i][j]
