class Solution {
    public int findMin(int[] nums) {

        int start=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[start]<=nums[end]){
                ans=Math.min(ans,nums[start]);
            }

            if(nums[start]<=nums[mid]){

                // left side is sorted

                ans=Math.min(ans,nums[start]);
                start=mid+1;


            }

            else{

                // right side is sorted
                ans=Math.min(ans,nums[mid]);
                end=mid-1;
            }

        }

        return ans;
        
    }


    

}
