class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def backtrack(row, col, index):
            if len(word) == index:
                return True
            if not (0 <= row <= len(board) - 1 and 0 <= col <= len(board[0]) - 1):
                return False

            letter = board[row][col]
            if letter != word[index] or letter == "#":
                return False

            ret = False
            board[row][col] = "#"

            for off_x, off_y in [[0, 1], [1, 0], [-1, 0], [0, -1]]:
                x = off_x + row
                y = off_y + col

                ret = backtrack(x, y, index + 1)

                if ret:
                    break
            board[row][col] = letter
            return ret

        for i in range(len(board)):
            for j in range(len(board[0])):
                if backtrack(i, j, 0):
                    return True
        return False

