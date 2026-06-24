class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][]rows = new boolean[9][9];
        boolean[][]cols = new boolean[9][9];
        boolean[][]box = new boolean[9][9];

        for(int  i = 0; i < 9; i ++){
            for(int j = 0; j < 9; j++){
                
                if(board[i][j] == '.'){
                    continue;
                }

                int value = board[i][j] - '1';

                int boxIndex = (i / 3) * 3 + (j / 3);

                if(rows[i][value] || cols[j][value] || box[boxIndex][value]){
                    return false;
                }

                rows[i][value] = true;
                cols[j][value] = true;
                box[boxIndex][value] = true;
            }
        }
        return true;
    }
}
