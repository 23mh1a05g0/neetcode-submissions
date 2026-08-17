class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        // for(int i=0;i<row;i++){
        //     for(int j = 0;j < col;j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
       
        // int r = 0, c = col-1;
        // while(r < row && c >= 0 ){
        //     int res = matrix[r][c];
        //     if(res > target){
        //         c--;
        //     }else if(res < target){
        //         r++;
        //     }else{
        //         return true;
        //     }
        // }
        // return false;

        int left = 0;
        int right = row * col -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int r = mid / col;
            int c = mid % col;
            if(matrix[r][c] > target){
                right = mid - 1;
            }else if(matrix[r][c] < target){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
