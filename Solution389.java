class Solution {
    /**
      * @param board: the board
        @return: wether the Sudoku is valid
      */
    public boolean isValidSudoku(char[][] board) {
        int[] data = {1,2,3,4,5,6,7,8,9};
        int[] flagX = new int[9];
        int[] flagY = new int[9];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                for(int n = 0; n < 9; n++) {
                    if(board[i][j]-'0' == data[n]) {
                        if(flagX[n] == -1 - i) {
                            return false;
                        }
                        flagX[n] = -1 - i;
                    }
                    if(board[j][i]-'0' == data[n]) {
                        if(flagY[n] == -1 - i) {
                            return false;
                        }
                        flagY[n] = -1 - i;
                    }
                }
            }
        }
        return true;
    }
};
