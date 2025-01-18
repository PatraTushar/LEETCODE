class Solution {

    static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int findDuplicate(int[] nums) {

        int i=0;
        
        
        while(i<nums.length){

            int correct=nums[i]-1;

            if(nums[i]!=nums[correct]){

                swap(nums,i,correct);


            }

            else{

                i++;
            }
        }

        for(int index=0;index<nums.length;index++){

            

            if(nums[index]!=index+1){
             return nums[index];
            }
        }


        return -1;


        
    }
}