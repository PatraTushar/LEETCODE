class Solution {

    static boolean isPossible(int arr[],int threshold,int mid){

        int ans=0;

        for(int i=0;i<arr.length;i++){

             ans+=(arr[i]+mid-1)/mid;

        }
       return ans<=threshold;
        
    }
    public int smallestDivisor(int[] nums, int threshold) {

        if(nums.length>threshold) return-1;
            
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

           max=Math.max(max,nums[i]);
        }

        int start=1;
        int end=max;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(isPossible(nums,threshold,mid)){

                end=mid-1;

            }

            else{

             start=mid+1;

            }

        }

        return start;
        
    }
}