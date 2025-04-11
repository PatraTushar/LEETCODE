class Solution {

       static int findMax(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
         max= Math.max(max,arr[i]);
        }

        return max;
    }

      static int sumOfArr(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

     static int isPossible(int[] arr,int mid){

        int parts=1;
        int total=0;

        for(int i=0;i<arr.length;i++){

            if(total+arr[i]<=mid){
                total+=arr[i];
            }
            else {
                parts++;
                total=arr[i];
            }
        }

        return parts;
        
    }


    public int splitArray(int[] nums, int k) {

          int start=findMax(nums);
        int end=sumOfArr(nums);

        while (start<=end){

            int mid=start+(end-start)/2;

            int totalParts=isPossible(nums,mid);

            if(totalParts>k){
                start=mid+1;

            }

            else {
                end=mid-1;
            }


        }

        return start;



       
    }
   
}