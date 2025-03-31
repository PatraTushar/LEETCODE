class Solution {
    public int findNumbers(int[] nums) {

        int count=0;

        for(int i=0;i<nums.length;i++){

            int ans=0;

            while(nums[i]>0){
                ans++;
                nums[i]/=10;

            }

            if(ans%2==0){
                count++;
            }

            else{
                continue;
            }

        }

        return count;
        
    }
}