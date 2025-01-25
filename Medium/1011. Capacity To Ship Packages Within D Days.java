class Solution {

    static boolean minCapacity(int arr[],int mid,int days){
        
        int load=0;
        int noOfDays=1;

        for(int i=0;i<arr.length;i++){

            if(load+arr[i]<=mid){
                load+=arr[i];
              
            }

            else{
                noOfDays+=1;
                load=arr[i];

                if(noOfDays>days){
                    return false;
                }
            }

        }

        return noOfDays<=days;
    } 
    public int shipWithinDays(int[] weights, int days) {

        int start=0;
        int end=0;
        

         for (int weight : weights) {
            start = Math.max(start, weight); // Max weight
            end += weight;                  // Total sum
        }
        

        while(start<=end){

            int mid=start+(end-start)/2;

            if(minCapacity(weights,mid,days)){

                end=mid-1;
            }

            else{

                start=mid+1;
            }
        }

        return start;
        
    }
}