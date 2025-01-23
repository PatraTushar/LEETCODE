class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n=nums.length-1;
        int start=0;
        int end=n;

        if(nums.length==1) return nums[0];

        while(start<=end){

          
            int mid=start+(end-start)/2;

            if(mid==0 && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

            if(mid==n && nums[n]!=nums[n-1]){
                return nums[n];
            }

            if( nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }

            else  if(mid%2==0 && nums[mid]==nums[mid-1] || mid%2!=0 && nums[mid]==nums[mid+1]){

                end=mid-1;

                
            }

            else{

                start=mid+1;
            }
        }

        return -1;
        
    }
}