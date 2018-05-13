class Solution:
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        rows = [list(lst[::]) for lst in board]
        columns = [[lst[idx] for lst in board] for idx in range(9)]
        blocks_origin = [board[row][column] for x in [[0, 1, 2], [3, 4, 5], [6, 7, 8]] for y in [[0, 1, 2], [3, 4, 5], [6, 7, 8]] for row in x for column in y] 
        blocks = [[blocks_origin[row * 9 + column] for column in range(9)] for row in range(9)]
        check = lambda lst: all([lst.count(x) == 1 for x in lst if x != '.'])
        return all([check(x) for style in (rows, columns, blocks) for x in style])