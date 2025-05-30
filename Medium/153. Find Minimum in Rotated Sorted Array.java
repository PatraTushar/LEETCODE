class Solution {
    public int findMin(int[] nums) {

        int start=0;
        int end=nums.length-1;
        int min=  Integer.MAX_VALUE;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[start]<=nums[mid]){

                if(nums[start]<min){
                    min=nums[start];
                }
                start=mid+1;
            }

            else{
                if(nums[start]<min){
                    min=nums[start];
                }
                end=mid;
            }
        }

            


    return min;
        
    }
}