class Solution {

      static int findMaxInWhichRow(int[][] arr,int rows,int cols){

        int max=Integer.MIN_VALUE;
        int row=-1;

        for(int i=0;i<rows;i++){

            if(arr[i][cols]>max){
                max=arr[i][cols];
                row=i;

            }
        }

        return row;


    }
    public int[] findPeakGrid(int[][] mat) {

           int rows=mat.length;
        int cols=mat[0].length;
        int low=0;
        int high=cols-1;


        while (low<=high){

            int mid=low+(high-low)/2;

            int rowHasMax=findMaxInWhichRow(mat,rows,mid);

            if((mid==0 || mat[rowHasMax][mid]>mat[rowHasMax][mid-1]) && (mid==cols-1 || mat[rowHasMax][mid]>mat[rowHasMax][mid+1])){

                return new int[]{rowHasMax,mid};

            }

            else if( mid>0 && mat[rowHasMax][mid-1]>mat[rowHasMax][mid]){
                high=mid-1;
            }

            else {
                low=mid+1;
            }





        }

        return new int[]{-1,-1};


        
    }
}