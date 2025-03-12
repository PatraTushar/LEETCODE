class Solution {

 static int  searching(int[] nums,int target,int start,int end){

    if(start>end) return -1;

    int mid=start +(end-start)/2;

    if(target==nums[mid]) return mid;

    if(nums[start]<=nums[mid]){

        if(target>=nums[start] && target <= nums[mid]){
            return searching(nums,target,start,mid-1);
        }

        else return searching(nums,target,mid+1,end);
    }

    if(target>nums[mid] && target <=nums[end]){
        return searching(nums,target,mid+1,end);
    }

    return searching(nums,target,start,mid-1);

 }

    public int search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        int ans=searching(nums,target,start,end);

        return ans;


        
    }
}