class Solution {
    public int maxSubArray(int[] nums) {

        int MAX=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            if(sum>MAX){
                MAX=sum;
            }

            if(sum<0){
                sum=0;
            }

          
        }

        return MAX;
        
    }
}