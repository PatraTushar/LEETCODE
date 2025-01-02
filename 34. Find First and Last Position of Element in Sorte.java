class Solution {
    public int[] searchRange(int[] nums, int target) {

        
        int[] ans={-1,-1};

        // check the first occurrence of target first

         ans[0]=search(nums,target,true);

         if(ans[0]!=-1){

             ans[1]=search(nums,target,false);

         }

         return ans;


    }

    static int search(int arr[],int target,boolean findFirstIndex){

        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }

            else{

                // potential answer found

                ans=mid;

                if(findFirstIndex){
                    end=mid-1;
                }

                else{
                    start=mid+1;
                }
            }
        }

        return ans;


    }
        
    }
