class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

          int rows=0;
        int columns=matrix[rows].length-1;

        while (rows<matrix.length && columns>=0){

            if(matrix[rows][columns]==target){
                return true;
            }

            else if(matrix[rows][columns]>target){
                columns--;
            }

            else {
                rows++;
            }
        }

        return false;
        
    }
}