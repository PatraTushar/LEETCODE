class Solution {

     static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {

           int i=0;
        int j=nums.length-1;

        while (i<j){

            if(nums[i]%2!=0 && nums[j]%2==0){
                swap(nums,i,j);
                i++;
                j--;
            }

            else if(nums[i]%2==0){
                i++;
            }

            else {
                j--;
            }
        }

        return nums;

        
    }
}