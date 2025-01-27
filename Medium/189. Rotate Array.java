class Solution {

    static void swap(int arr[],int a,int b){
     int temp=arr[a];
     arr[a]=arr[b];
     arr[b]=temp;
    }

    static void reverse(int arr[],int i,int j){


        while(i<j){
        swap(arr,i,j);
        i++;
        j--;
        }

    }
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
         reverse(nums,0,nums.length-1);
         reverse(nums,0,k-1);
         reverse(nums,k,nums.length-1);
        

        
        
    }
}