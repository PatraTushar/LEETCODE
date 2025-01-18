class Solution {

    static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> ans=new ArrayList<>();

        int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;

            if( nums[i]!=nums[correct]){

                swap(nums,i,correct);


            }

            else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){

            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }

            

            
        }

        return ans;
        
    }
}