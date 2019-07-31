class Solution {
    public boolean isValidSudoku(char[][] board) {
        //用位存储各元素状态，000000001表示1，000010010表示2,5......
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] blks = new int[9];
        for(int ri = 0; ri < 9; ++ri){
            for(int ci = 0; ci < 9; ++ci){
                if(board[ri][ci] != '.'){
                    int bi = ri / 3 * 3 + ci / 3;
                    int uvb = 1 << (board[ri][ci] - '1');
                    if((uvb & (rows[ri] | cols[ci] | blks[bi])) != 0)
                        return false;
                    rows[ri] |= uvb;
                    cols[ci] |= uvb;
                    blks[bi] |= uvb;
                }
            }
        }
        return true;
    }
}
