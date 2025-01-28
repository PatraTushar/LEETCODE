class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }

            else{
                
                if(count>ans) ans=count;
                count=0;            
            }
            
        }

        ans=Math.max(count,ans);

        return ans;
        
    }
}