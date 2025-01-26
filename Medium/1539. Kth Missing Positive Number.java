class Solution {
    public int findKthPositive(int[] arr, int k) {

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;


        // if number of missing element is less than k
            if(arr[mid]-mid-1<k){
                // move start to mid+1
                start=mid+1;
            }

            else{
                // move end to mid-1
                end=mid-1;
            }
        }

        return start+k;
        
    }
}