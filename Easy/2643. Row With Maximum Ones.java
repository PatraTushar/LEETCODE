class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

           int max=-1;
        int rows=mat.length;
        int cols=mat[0].length;
        int index=-1;
        int[] result=new int[2];

        for(int i=0;i<rows;i++){

            int countRow=0;

            for (int j=0;j<cols;j++){
                countRow+=mat[i][j];

            }
            if(countRow>max){
                max=countRow;
                index=i;

            }

        }

        result[0]=index;
        result[1]=max;

        return result  ;


        
    }
}