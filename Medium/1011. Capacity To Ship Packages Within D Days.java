class Solution {

     static int findMax(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int a:arr){
            if(a>max){
                max=a;
            }
        }

        return max;
    }

    static int findSum(int[] arr){

        int sum=0;
        for(int a: arr){
            sum+=a;
        }
        return sum;
    }

    static int isPossible(int[] arr,int mid){

        int noOfDays=1;
        int capacity=0;

        for(int i=0;i<arr.length;i++){

            if(capacity+arr[i]<=mid){

                capacity+=arr[i];

            }

            else {
                noOfDays++;
                capacity=arr[i];
            }

        }

        return noOfDays;


    }

    public int shipWithinDays(int[] weights, int days) {

          if(days>weights.length) return -1;

        int start=findMax(weights);
        int end=findSum(weights);

        while (start<=end){

            int mid=start+(end-start)/2;

            int totalDays=isPossible(weights,mid);

            if(totalDays>days){

                start=mid+1;
            }

            else {

                end=mid-1;

            }
        }
        return start;
        
    }
}