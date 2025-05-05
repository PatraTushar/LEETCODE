class Solution {

     static int findFirst(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int index=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                index=mid;
                end=mid-1;
            }

            else if(target>arr[mid]) start=mid+1;
            else end=mid-1;
        }

        return index;
    }

    static int findLast(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int index=-1;

        while (start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){

                index=mid;
                start=mid+1;

            }
            else if(target>arr[mid]) start=mid+1;
            else end=mid-1;
        }

        return index;
    }

    public int[] searchRange(int[] nums, int target) {

         int[] result=new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);

        return result;


        
    }
}