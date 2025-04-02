class Solution {
    public int[] sortedSquares(int[] nums) {

          int n=nums.length;
        int i=0;
        int j=n-1;
        int k=n-1;
        int[] result=new int[n];

        while (i<=j){
            if(k<0) break;;

            if( Math.abs(nums[i])>Math.abs(nums[j])){
                result[k]=nums[i]*nums[i];
                i++;


            }

            else {
                result[k]=nums[j]*nums[j];
                j--;

            }

            k--;
        }

        return result;
        
    }
}