class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;

        while(i < row){
            if(target >= matrix[i][0] && target <= matrix[i][col - 1]){
                break;
            }
            else{
                i++;
            }
        }

        if (i == row){
            return false;
        }

        for(int j = 0; j < col; j++){
            if(matrix[i][j] == target){
                return true;
            }
        }
        return false;
    }
}
