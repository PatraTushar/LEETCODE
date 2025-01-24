class Solution {

    static int canMakeMBouq(int nums[],int mid,int k){

        int count=0;
        int bCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
            }

            else{
                count=0;
            }

            if(count==k){
                bCount++;
                count=0;
            }
        }

        return bCount;

      

    }
    public int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }

        int start=0;
        int end=0;
        int result=-1;

        for(int i=0;i<bloomDay.length;i++){

            start=Math.min(start,bloomDay[i]);
            end=Math.max(end,bloomDay[i]);
        }

        while(start<=end){

            int mid=start+(end-start)/2;
          

            if(canMakeMBouq(bloomDay,mid,k)>=m){

                result=mid;
                end=mid-1;

            }

            else{
                start=mid+1;
            }

        }

        return result;
        
    }
}